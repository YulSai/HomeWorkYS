Пакет additional.collections.comporator:
ComparatorForListFromMapCount - класс с компаратором для сортировки объектов по количеству, решает пункт ДЗ 2.2
ComparatorForListFromMapTitle - класс с компаратором для сортировки объектов по наименованию, решает пункт ДЗ 2.2

Пакет additional.collections:
MakerForCollection - класс с методами создания и обработки коллекций Set и Map, решает пункт ДЗ 2.1, 2.2
MapCollection - класс с методами создания и обработки коллекции Мар, решает пункт ДЗ 2.2
SetCollection - класс с методами создания и обработки коллекции Set, решает пункт ДЗ 2.1

Пакет additional.searchEngines.api:
ISearchEngine - интерфейс с методом поиска слов в тексте, решает пункт ДЗ 3

Пакет additional.searchEngines:
EasySearch - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его количества
в тексте с использованием indexOf, решает пункт ДЗ 4.1
RegExSearch - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его количества
в тексте с использованием регулярных выражений, решает пункт ДЗ 4.2
SearchEngineCaseNormalizer - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета
его количества в тексте без учета падежей, решает пункт ДЗ 4.5
SearchEngineIgnoreCase - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета его
количества в тексте без учета регистра, решает пункт ДЗ 4.4
SearchEnginePunctuationNormalizer - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова и подсчета
его количества в тексте без нежелательных символов, решает пункт ДЗ 4.3

Пакет additional.stringMaker:
FileToString - класс с методом для считывания текста из файла, решает пункт ДЗ 2 и 4
MakerForString - класс с методами обработки текса из файла, решает пункт ДЗ 2 и 4

Пакет resources:
Война и мир_книга - файл с текстом, решает пункт ДЗ 1

Пакет runners:
CollectionMain - класс с точкой входа для классов MakerForString и MakerForCollection, решает пункт ДЗ 2
SearchMain - класс с точкой входа для MakerForString и ISearchEngine, решает пункт ДЗ 5

Пакет test:
EasySearchTest - класс, тестирующий EasySearch, решает пункт ДЗ 6
RegExSearchTest - класс, тестирующий RegExSearch, решает пункт ДЗ 6
SearchEngineCaseNormalizerTest - класс, тестирующий , решает пункт ДЗ 6
SearchEngineIgnoreCaseTest - класс, тестирующий SearchEngineCaseNormalizer, решает пункт ДЗ 6
SearchEnginePunctuationNormalizerTest - класс, тестирующий SearchEnginePunctuationNormalizer, решает пункт ДЗ 6