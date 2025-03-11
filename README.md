# inheritance
#پروژه شبیه‌سازی پرداخت‌های مختلف

این پروژه یک برنامه ساده برای شبیه‌سازی پرداخت‌های مختلف توسط مشتریان با استفاده از روش‌های پرداخت متفاوت است.

## ساختار پروژه

پروژه شامل کلاس‌ها و اینترفیس‌های زیر است:

### 1. اینترفیس PaymentStrategy
این اینترفیس دو متد دارد:
- void pay(double amount): برای انجام پرداخت.
- String getPaymentDetails(): برای برگرداندن جزئیات پرداخت.

### 2. کلاس‌های پیاده‌کننده PaymentStrategy
- **CreditCardPayment**: پرداخت با کارت اعتباری.
- **PayPalPayment**: پرداخت با PayPal.
- **BitcoinPayment**: پرداخت با بیت‌کوین.

### 3. کلاس Customer
این کلاس abstract است و شامل:
- فیلدها: name  (نام مشتری) و  paymentHistory  (تاریخچه پرداخت‌ها).
- متدها:
  - makePayment(PaymentStrategy paymentStrategy, double amount): برای انجام پرداخت.
  - showPaymentHistory(): برای نمایش تاریخچه پرداخت‌ها.
  - abstract void displayCustomerInfo(): برای نمایش اطلاعات مشتری.

### 4. زیرکلاس‌های Customer
- **RegularCustomer**: مشتری عادی.
- **PremiumCustomer**: مشتری ویژه .

### 5. کلاس Main
این کلاس شامل متد main است که در آن:
- چند مشتری ایجاد می‌شود.
- پرداخت‌های مختلف با روش‌های متفاوت انجام می‌شود.
- تاریخچه پرداخت‌ها نمایش داده می‌شود.
