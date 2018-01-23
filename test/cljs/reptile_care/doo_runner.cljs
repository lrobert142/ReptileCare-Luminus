(ns reptile-care.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [reptile-care.core-test]))

(doo-tests 'reptile-care.core-test)

