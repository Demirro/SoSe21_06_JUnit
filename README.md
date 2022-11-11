# SoSe21_06_JUnit

## Übungsaufgabe für das Programmierpraktikum im SoSe 2021 zum 03.06.2021

Ich hoffe ihr genießt eure Uni-freie Woche, aber ganz entkommt ihr nicht. Als Nachtrag zur letzten Stunde habe ich euch eine kleine Aufgabe zu JUnit-Tests gemacht. Dabei geht es allerdings nicht darum eigene Tests zu schreiben, sondern Methoden anhand von Tests zu implementieren. Eine kleine Übung für die Modulprüfung, bei welcher das Teil der Arbeit sein wird.

### 📝 Aufgabe:

Im hochgeladenen Projekt befindet sich essenziell nur eine Klasse *StringUtils*. In dieser Klasse befinden sich drei Methoden, welche ihr natürlich implementieren müsst. Dafür habt ihr zwei "Hilfestellungen" beziehungsweise Vorgaben. Die JavaDoc-Beschreibung der Methode, sowie die Tests in der Klasse *TestCases*.

Zu dieser Klasse ein kleiner Exkurs:
Es ist eine gute Idee JUnit-Tests so klein und präzise aufzubauen wie möglich. Man sollte versuche nur eine Assertion pro Test zu machen. Das hat den simplen Grund der Lesbarkeit, sowie der Nachvollziehbarkeit. Beispiel:
Schreibe ich einen Test mit fünf Assertions (für verschiedene Ausgangsmöglichkeiten einer Methode) und fehlt nur eine davon fehl, schlägt die ganze Testmethode fehl. Zusätzlich dazu, weiß ich gar nicht unbedingt wo der Fehler liegt oder kriege keine genaue Stacktrace/Erläuterung.
Wenn ich stattdessen für jeden Fall einen eigenen Test schreibe, weiß ich genau wo ein Fehler vorliegt, wenn einer der Tests fehlschlägt.
You get the idea.
Um das ganze aber ein bisschen schöner, aufgeräumter und lesbarer zu machen kann man diese diversen Testmethoden "gruppieren" beziehungsweise verschachteln und ihnen auch einen Namen geben. Das ist das was ihr in *TestCases* seht (DisplayName und Nested). Im Test-Fenster von Eclipse könnt ihr die Tests dann auf- und zuklappen, habt aber sonst den gleichen Zugriff auf alle Informationen.

Und das war es auch schon. Probiert die Methoden so zu programmieren, dass sie die Tests bestehen. That's all.

Viel Spaß und Erfolg
    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Börges Seminar Video (Iterable)](https://www.ilias.uni-koeln.de/ilias/ilias.php?ref_id=3957251&eid=0cf2923f-21a8-4ba4-94f4-6c8fcfe2a9b5&cmd=streamVideo&cmdClass=xoctplayergui&cmdNode=x2:p7:18a:18l&baseClass=ilrepositorygui)

- [📃 Unit-Tests (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/JUnit.html)
- [📃 JUnit (Extern DE)](https://openbook.rheinwerk-verlag.de/javainsel/21_002.html)

- [📃 Java Naming Conventions](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Naming-Conventions.md)
