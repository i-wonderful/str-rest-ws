<<<<<<< HEAD
## JAX-RS with Jersey and Grizzly or Jetty on Heroku

JAX-RS is a great way to build RESTful services in Java. This is a very quick and simple example of how you can deploy a JAX-RS application on Heroku. 

Assuming you're already set up with Heroku including the foreman tool, all you need to do to run this locally is

1. Clone this repo
2. cd into the directory
3. mvn package
4. foreman start

To deploy to Heroku:

1. heroku create --stack cedar
2. git push heroku master
3. curl http://[appname].herokuapp.com/hello

It's that simple.

## Grizzly or Jetty

The master branch currently uses Grizzly. If you want to use Jetty, check out the jetty branch instead:

    $ git clone -b jetty git@github.com:jesperfj/jax-rs-heroku.git

=======
# java-getting-started

A barebones Java app, which can easily be deployed to Dokkur.

This application supports the [Getting Started with Java on Dokkur](https://dokkur.com/#!/documentation/getting_started/java) article - check it out.

## Deploying to Dokkur

[Deploy to Dokkur](https://dokkur.com)

## Documentation

For more information about using Java on Dokkur, see these Documentation articles:

- [Getting Started with Java on Dokkur](https://dokkur.com/#!/documentation/getting_started/java)
>>>>>>> a348a0cec554f12ccfdff9e903b95217d83274ef
