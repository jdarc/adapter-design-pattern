# Adapter Design Pattern 

This design pattern is described by: https://refactoring.guru/design-patterns/adapter

This project aims to demonstrate how the adapter design pattern can be used to 
provide an abstraction layer that decouples a system from concrete implementations.

It also aims to demonstrate one possible set up a Kotlin multi-module gradle project.

## Purpose
In this somewhat contrived demonstration, there are 3 modules...

- common
  - contains base classes and interfaces used across all modules
- game
  - the application specific classes and interfaces, the final deployable unit
  - uses a simplistic IOC container for demo purposes 
- physics
  - the module that encapsulates the "Loco" physics engine and provides the adapters
  - hides the concrete physics engine, no leaking of concrete implementation details
  - wires up dependencies
    
There is also some aspect of other patterns present in this demonstration, but its 
primary goal is to promote the idea of maximum cohesion, minimum coupling.

The simulation is trivial and simply accelerates a body due to gravity.

## Running
```
./gradlew run
```

## License
MIT License

Copyright © 2021 Jean d'Arc

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
