# Java Demo Interface

Interfaces are often used in situations where you want to define a contract for behavior that should be implemented by multiple classes, but you don't want to specify the implementation details. Here are some specific situations where interfaces can be particularly useful:

1. Defining a plugin system: If you are building a system where you want to allow other developers to create plugins, you can define an interface that the plugin classes must implement. This ensures that the plugins can be used interchangeably by the system, as long as they conform to the interface.

2. Building a framework or library: If you are building a framework or library that will be used by other developers, you can define interfaces that define the behavior that the users of the library should implement. This helps to ensure that the users of the library will be able to use it in a consistent way, and that their code will be compatible with future versions of the library.

3. Encapsulating behavior: If you have behavior that should be shared between multiple classes, you can encapsulate that behavior in an interface. This allows the behavior to be easily reused and shared, without the need to duplicate code between multiple classes.

4. Achieving loose coupling: Interfaces can be used to achieve loose coupling between different parts of a system. By defining interfaces that specify the behavior of different parts of the system, you can write code that is independent of the specific implementation details, making it easier to change or replace different parts of the system in the future.

To call an interface in Java, you first need to define a class that implements the interface. This class must provide an implementation of all the methods defined in the interface. This code is an example:

Refer to code and observe output:

[![Vaibhav Mojidra - 1.jpeg](https://raw.githubusercontent.com/VaibhavMojidra/Java---Demo-Interface/master/output/1.jpeg "Vaibhav Mojidra")](https://vaibhavmojidra.github.io/site/)

Let's say you are building a music player application, and you want to support different types of music files, such as MP3, WAV, and FLAC. To handle this, you can define an interface called Playable that represents the behavior of a playable music file:

You can then define classes that implement the Playable interface, such as Mp3File, WavFile, and FlacFile. Each of these classes will provide their own implementation of the play(), stop(), pause(), and skip() methods.

Now, in your music player application, you can work with any type of playable music file by simply using the Playable interface:

In this example, the MusicPlayer class accepts any object that implements the Playable interface, which allows it to work with any type of playable music file. This makes the application more flexible and extensible, as new types of playable music files can be added simply by implementing the Playable interface.

To use the MusicPlayer class with a specific type of playable music file, you would create an instance of that class, and then call the appropriate methods on that instance, passing in an object that implements the Playable interface. For example, to play an Mp3File using the MusicPlayer class

In this example, we create an instance of the Mp3File class and assign it to a variable of type Playable, which is possible because Mp3File implements the Playable interface. We then create an instance of the MusicPlayer class and call the play() method on the player object, passing in the p object as a parameter.