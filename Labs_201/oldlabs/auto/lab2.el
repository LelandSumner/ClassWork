(TeX-add-style-hook "lab2"
 (lambda ()
    (LaTeX-add-environments
     "LabExercises")
    (LaTeX-add-labels
     "fig:login")
    (TeX-add-symbols
     '("foreign" 1)
     '("note" 1)
     '("fname" 1)
     '("code" 1)
     "ensurecomma"
     "eg"
     "ie"
     "cf"
     "ensuresingleperiod"
     "etc"
     "etal"
     "LabExercise"
     "FileCreated"
     "FileRevised")
    (TeX-run-style-hooks
     "exercise"
     "rotating"
     "listings"
     "pstricks"
     "textcomp"
     "fontspec"
     "xltxtra"
     "color"
     "usenames"
     "graphicx"
     "epsfig"
     "latex2e"
     "memoir10"
     "memoir"
     "10pt"
     "twoside")))

