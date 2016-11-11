# TextInputTest
Tests the application life cycle and Gdx.input.getTextInput.

Use the usual GDX gradle setup. Create a desktop configuration on android studio.

# Check the log messages for Android and Desktop:

On Desktop we have an additional pause() method call at start of text input.
At the end we get the log message from the listener and then a call to the resume method.

On Android we do not get these method calls.

# Further observation:

On Android the text input dialogue disappears if we touch the screen outside the text dialogue.

