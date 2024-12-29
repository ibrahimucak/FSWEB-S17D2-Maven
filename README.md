#  Java Spring Boot Dependency Injection

Bu proje, Spring Boot kullanarak Dependency Injection (DI) ve temel CRUD işlemleriyle ilgili bir uygulama geliştirmeyi hedefliyor. Projeyi özetlemek gerekirse:

Proje Adımları ve Gereksinimler
1. Spring Boot Kurulum ve Konfigürasyon
Maven kullanarak bağımlılıkları yönetin.
Uygulamayı 8585 portundan çalıştırın.
Tüm endpoint'lerin başına workintech ekleyin (application.properties ile yapılandırılacak).
Spring DevTools kullanarak uygulamanın her değişimde otomatik olarak yeniden başlatılmasını sağlayın.
2. Paket Yapısı
main metodunun bulunduğu paket dışında iki yeni paket oluşturun: model ve tax.
rest paketi içerisinde DeveloperController sınıfını oluşturun.
3. Model Sınıfları
Developer sınıfı oluşturun: id, name, salary ve experience (enum: JUNIOR, MID, SENIOR) değişkenlerine sahip olmalı.
Developer sınıfının her değişkenini set eden bir constructor ekleyin.
Developer sınıfından türeyen 3 farklı sınıf oluşturun: JuniorDeveloper, MidDeveloper, SeniorDeveloper.
4. Tax Sınıfları
tax paketine Taxable adlı bir interface ekleyin. Bu interface içinde üç metod tanımlanmalı:
getSimpleTaxRate()
getMiddleTaxRate()
getUpperTaxRate()
DeveloperTax sınıfını yazın, Taxable interface'ini implement etsin ve belirtilen metodları override ederek:
getSimpleTaxRate() -> 15
getMiddleTaxRate() -> 25
getUpperTaxRate() -> 35 döndürsün.
5. CRUD Endpoint'leri
DeveloperController içinde Map<Integer, Developer> türünde bir developers objesi oluşturun.
@PostConstruct ile developers map'ini başlatın.
DeveloperController sınıfına bir constructor ekleyin, Taxable interface'ini Dependency Injection ile çağırın (burada DeveloperTax sınıfını kullanacaksınız).
CRUD işlemleri için aşağıdaki endpoint'leri oluşturun:

[GET] /workintech/developers: Tüm developers map'inin değerlerini JSON olarak döner.
[GET] /workintech/developers/{id}: İlgili ID'deki developer'ı döner.
[POST] /workintech/developers: id, name, salary, experience alır ve deneyime göre uygun developer objesini oluşturur. Developer'ın maaşından, deneyim türüne bağlı olarak tax rate uygulanmalıdır.
[PUT] /workintech/developers/{id}: İlgili ID'deki developer'ı günceller.
[DELETE] /workintech/developers/{id}: İlgili ID'deki developer'ı siler.
6. Spring Actuators
/mappings ve /health endpoint'lerini kullanarak uygulamanın durumunu kontrol edin.
/info endpoint'inin çalışabilmesi için application.properties dosyasına name, description, version bilgilerini ekleyin.
