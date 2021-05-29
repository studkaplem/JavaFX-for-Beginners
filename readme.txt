A JavaFX Stage, javafx.stage.Stage, represents a window in a JavaFX desktop application.
Inside a Stage cou can insert a Scene which represent the content
- Stage Width and Height:
stage.setWidth(600);
stage.setHeight(300);

- Stage Position:
stage.setX(50);
stage.setY(50);


Scene contains all the visual JavaFX GUI components inside it.
A Scene object has to be set on a JavaFX Stage to be visible
- Scene Mouse Cursor:
Cursor.OPEN_HAND
Cursor.CLOSED_HAND
Cursor.CROSSHAIR
Cursor.DEFAULT
Cursor.HAND
Cursor.WAIT
Cursor.H_RESIZE
Cursor.V_RESIZE
Cursor.MOVE
Cursor.TEXT

The JavaFX Node class, javafx.scene.Node, is the base class (superclass) for all
components added to the JavaFX Scene Graph. The JavaFX Node class is abstract,
so you will only add subclasses of the Node class to the scene graph. All JavaFX Node instances
in the scene graph share a set of common properties which are defined by the JavaFX Node class.
These common properties will be covered in this JavaFX Node tutorial.
Each JavaFX Node (subclass) instance can only be added to the JavaFX scene graph once