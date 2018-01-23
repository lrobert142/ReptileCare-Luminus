(ns ^:figwheel-no-load reptile-care.app
  (:require [reptile-care.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
