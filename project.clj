(defproject obb-rules "0.1.0"
  :description "Puppet Coliseum's Rules"
  :url "https://github.com/puppet-coliseum/rules"

  :license {:name         "The MIT License"
            :url          "file://LICENSE"
            :distribution :repo
            :comments     "Copyright 2011-2014 Puppet Coliseum All Rights Reserved."}

  :dependencies [[org.clojure/clojure "1.7.0-alpha6"]]

  :source-paths ["src"]
  :test-paths ["test"]

  :profiles {:dev {:dependencies [[org.clojure/test.check "0.6.2"]
                                  [criterium "0.4.3"]]
                   :global-vars {*warn-on-reflection* false
                                 *assert* true}
                   :plugins [[com.jakemccrary/lein-test-refresh "0.5.5"]
                             [lein-cloverage "1.0.2"]]}})
