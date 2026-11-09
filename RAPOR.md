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

![Akış Şeması](<img width="1182" height="1034" alt="Screenshot 2026-11-09 182351" src="https://github.com/user-attachments/assets/193190b3-d360-4768-bf64-e82b0fba9a19" />
) {yukledim ama nedense tikladigimda acilmiyor}

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

