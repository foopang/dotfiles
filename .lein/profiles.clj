{:user {:plugins [[refactor-nrepl "2.4.0-SNAPSHOT"]
                  [cider/cider-nrepl "0.16.0"]
                  [lein-ancient "0.6.8"]]
        :dependencies [[org.clojure/tools.nrepl "0.2.12"]
                       [com.cemerick/piggieback "0.2.1"]]
        :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
