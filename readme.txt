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