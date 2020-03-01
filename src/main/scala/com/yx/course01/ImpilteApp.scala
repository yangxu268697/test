package com.yx.course01

import java.io.File


object ImpilteApp {
  implicit def file2supper(file: File): SupperFile = new SupperFile(file)

  implicit  def man2supper(man: Man):Superman =new Superman(man.name)
}
