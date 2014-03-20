android-listview-custom-view
============================

An example of using a custom `View` subclass with `ListView` and a custom `Adapter`.

`ItemView` encapsulates the pattern of:

* Creating a complex view for a list item
* Finding and populating child views with data (the "Holder" pattern)
* Associating a view with a model object

## Interesting Files

### ItemView.java

The `ItemView` class is a subclass of `RelativeLayout` that knows how to inflate its own children (from a separate layout file) during construction.

It has methods to access its child views by useful names (`getTitleTextView()`), but these methods are used only in the unit tests. It excels in its encapsulation of translating an `Item` into its views using `setItem(Item)`.

The static `inflate(ViewGroup)` method encloses the private details of which layout should be used to create an instance of this class. The `ItemAdapter` relies on this to make instantiation as simple as one succint line of code.

### res/layout/item_view.xml

This layout is used by the `inflate(ViewGroup)` method on `ItemView` to create a new instance, but it could also be used via an `include` tag elsewhere in another layout and work just as well. It intentionally avoids placing child views inside the `ItemView`, since that work is handled in the `ItemView` constructor.

### res/layout/item_view_children.xml

This layout sets up the children of the `ItemView` at construction time. The `merge` tag at the root means that the children of it will be added directly as children of the `ItemView`. The resulting layout is efficient for both the programmer (little code required to use `ItemView`) and the rendering engine (no extra nesting or useless container layouts).

### The Tests

There are unit tests that cover `ItemView`, `ItemAdapter` and `Item`. If you have some good pointers on how to effectively test `ItemListFragment`, please get in touch. I tried, and it's non-trivial.
