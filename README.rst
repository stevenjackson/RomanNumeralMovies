Getting up and running
======================

Need to compile java files in java/src.

TODO:  Add build script

Running
=====================
    rackup

Should start an instance at http://localhost:9292


Importing Data
=====================

By default, the film.db contains a flat table called filmwith all the data from film.tsv.

This was generated using the sqlite.import.film script

     sqlite film.db << sqlite.import.film


