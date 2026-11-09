# Rapor

**Ad Soyad: Ege KARADUMAN**
**Numara: 793**

## 1. Problemin Açıklaması
Klasik asansor problemi bize if cokca kullandiran ve bassit islem gerektiren 2 veri girdisi olan guzel bir problem.


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-kat,gidilen

**İşlemler:**
-(cikilan_kat= gidilen-kat) or (inilen_kat= kat-gidilen)

**Çıktılar:**
-(inilen or cikilan_kat) and (yukari or asagi)

## 3. Sözde Kod (Pseudocode)

```
1.
2.
3.
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | 5 yukari | True |
| 9 | 2 | 7 kat aşağı | 7 asagi | True |
| 5 | 5 | Hareket yok | ayni kat | True |
| 1 | 10 | 9 kat yukarı | 9 yukari | True |
| 10 | 1 | 9 kat aşağı | 9 asagi | True |
| 0 | 5 | Geçersiz mevcut kat | imha | True |
| 5 | 11 | Geçersiz hedef kat | imha | True |
| -2 | 4 | Geçersiz mevcut kat | imha | True |

## 6. Ekstra Görev (Opsiyonel)
Yapmadim opsiyonel diyor

