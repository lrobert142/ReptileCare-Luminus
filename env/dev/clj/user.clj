(ns user
  (:require 
            [mount.core :as mount]
            [reptile-care.figwheel :refer [start-fw stop-fw cljs]]
            [reptile-care.core :refer [start-app]]))

(defn start []
  (mount/start-without #'reptile-care.core/repl-server))

(defn stop []
  (mount/stop-except #'reptile-care.core/repl-server))

(defn restart []
  (stop)
  (start))


