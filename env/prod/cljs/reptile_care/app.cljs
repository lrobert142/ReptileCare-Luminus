(ns reptile-care.app
  (:require [reptile-care.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
