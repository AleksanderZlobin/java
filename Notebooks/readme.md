Метод menu выполняет основной функционал магазина, в нём находятся ниже перечисленные методы, а так же в нём находится сама база данных из 43 ноутбуков(в виде объектов класса), после преобразуется в список.
Метод filterRAM выполняет фильтрацию ноутбука по оперативной памяти, от и до значений введённых пользователем, например 8 - 16.
Метод filterSSD выполняет фильтрацию ноутбука по объёму ssd накопителя, от и до значений введённых пользователем, например 256 - 512.
Метод filterTypeSSD выполняет фильтрацию по типу памяти, на пример DDR5.
Метод filterBrand выполняет фильтрацию ноутбуков по их производителю, например ASUS.
Метод filterOS выполняет фильтрацию ноутбуков по операционной системе, например Windows 11 pro.
Метод filterScreenResolution выполняет фильтрацию ноутбуков по диагонали экрана, от и до введённого пользователем, например 13,0 - 16,0.
Метод filterColor выполняет фильтрацию ноутбука по цвету, например silver.
Метод filterKeyboard выполняет фильтрацию по раскладке клавиатуры, например Russian.
Метод filterCpuBrand выполняет фильтрацию по производителю процессоров, например AMD.
Метод filterPrice выполняет фильтрацию по цене, например 100000 - 160000.
Метод filterState выполняет фильтрацию по состоянию ноутбука, например new.
Дополнительные методы:
Метод showCatalog выводит все ноутбуки из списка.
Метод info выводит информацию об одном определённом ноутбуке, используется в каждом выше перечисленном методе, кроме menu.