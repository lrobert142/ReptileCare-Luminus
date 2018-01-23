(ns reptile-care.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[reptile-care started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[reptile-care has shut down successfully]=-"))
   :middleware identity})
