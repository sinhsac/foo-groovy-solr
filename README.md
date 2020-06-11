# Foo Spring boot Groovy with solr 

### This project use only Spring boot with solr embedded

#### Usage
* Run command `gradlew bootRun`


#### Configuration
* Add new collection or domain.

The first, add new domain Groovy, then go to folder `solr_home\cores` add new folder the same collection name.
Then add `core.properties` with value `name=YOUR_COLLECTION`, add `schema.xml`, `solrconfig.xml`

Finally, We can use simple as use Spring Repo
