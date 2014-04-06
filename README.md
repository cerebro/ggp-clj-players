# ggp-clj-players

A Clojure libary which leverages the excellent ggp-base Java library open sourced by Sam Schreiber for general game playing (https://github.com/ggp-org/ggp-base)

Take a look at the Random Move Player clojure code and build upon it. I intend to try to add more players as I go through the GGP class on Coursera (https://class.coursera.org/ggp-002). Pull requests are more than welcome!

## Usage
```
git submodule init
git submodule update
lein sub install
lein do deps, compile
lein kiosk
```

Then pick any of the sample games available in the Kiosk and pick the cljRandomPlayer to test it out. The other sample players listed come from the Java library itself.

You can also fire the player of your choice for remote game playing via ```lein launch``

## License

Copyright © 2014 Sébastien Arnaud
