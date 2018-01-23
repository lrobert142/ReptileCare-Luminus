(ns reptile-care.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [reptile-care.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[reptile-care started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[reptile-care has shut down successfully]=-"))
   :middleware wrap-dev})
