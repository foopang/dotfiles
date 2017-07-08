{:user {:plugins [[cider/cider-nrepl "0.15.0-SNAPSHOT"]
                  [lein-ancient "0.6.8"]]
        :dependencies [[org.clojure/tools.nrepl "0.2.12"]
                       [com.cemerick/piggieback "0.2.1"]]
        :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
