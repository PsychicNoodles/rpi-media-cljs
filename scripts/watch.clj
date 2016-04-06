(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'rpi-media-cljs.core
   :output-to "out/rpi_media_cljs.js"
   :output-dir "out"})
