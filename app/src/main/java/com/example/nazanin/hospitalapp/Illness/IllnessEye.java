package com.example.nazanin.hospitalapp.Illness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nazanin.hospitalapp.R;


public class IllnessEye extends Fragment {
    Button btn1, btn2 , btn3, btn4;



    public static IllnessEye newInstance() {
        IllnessEye fragment = new IllnessEye();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_illness_eye, container, false);
        btn1 = v.findViewById(R.id.btn_DCR);
        btn2 = v.findViewById(R.id.btn_kataraket);
        btn3 = v.findViewById(R.id.btnLoze);
        btn4 = v.findViewById(R.id.btn_nakhonak);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("داکریوسیستیت(عفونت مجرای اشکی )DCR");
                fragment.SetBody("عفونت مجرا، کیسه یا غده اشکی، داکریوسیستیت نام دارد. میکروبهای عامل عفونت میتوانند به سایر افراد منتقل شوند. عفونت مجرا یا کیسه اشکی در تمام سنین رخ میدهد اما در کودکان شایعتر است.\n" +
                        "خراش، انسداد یا تنگی مجرای اشکی که معمولاً ناشی از اختلال ارثی یا عفونت قبلی است، داکریواستنوزیس نام دارد. انسداد ارثي مجرای اشکی معمولاً در شیرخواران  3-12هفته ظاهر میشود. انسداد ناشی از عفونت میتواند در هر سنی به دنبال عفونت رخ دهد.\n" +
                        "علایم:\n" +
                        "*اشك ریزش همیشگی از یك یا هر دو چشم\n" +
                        "*تخلیه مخاط و چرک به جای آب از مجرای اشکی. تخلیه ممکن است خود به خود یا با فشار برروی موضع صورت پذیرد.\n" +
                        "*درد، قرمزی و تورم زیر چشم که عفونت را مطرح میکند.\n" +
                        "*قرمزی سفیدی چشم در اطراف مجرای اشکی\n" +
                        "علل:\n" +
                        "*اختلال ارثی\n" +
                        "*عفونت باکتریایی مجرا\n" +
                        "*عفونت سینوس یا بینی بهویژه عفونت مزمن بینی\n" +
                        "*پولیپهای بینی\n" +
                        "*آسیب چشم\n" +
                        "*عفونت چشم از جمله قرمزی شدید چشم (کونژکتیویت)\n" +
                        "*شکستگی بینی یا استخوانهای صورت\n" +
                        "تشخیص:\n" +
                        "زمانی که بیمار از اشكریزش شکایت دارد، چشمپزشك با معاینهی دقیق، متوجه میشود که آیا این اشك ریزش به دلیل افزایش تولید اشك است یا کاهش تخلیه آن. با رد کردن علل افزایش تولید، و با معایناتی مانند فشار دادن روی کیسه اشکی که در صورت وجود انسداد سبب خروج مایع و چرک از منافذ اشکی میشود، یا با تزریق مایع تلخ مزه از داخل منافذ اشيکی (سيوندا  سیستم اشکی) وبررسی عبور یا عدم عبور آن به بینی، که در صورت وجود انسداد در مجرای اشکی مایع به بینی عبور نخواهد کرد و بیمار مزه تلخ\n" +
                        "مایع را در گلوی خود احساس نخواهد کرد، تشخیص می دهد که بیمار دچار انسداد مجرای اشکی است. \n" +
                        "تصویربرداری طب هسته ای در تشخیص انسداد مجرای اشکی کمك فراوانی به پزشك میکند.\n" +
                        "درمان :\n" +
                        "انسداد مجرای اشکی فقط در سنین زیر دو الی سه سال با میل زدن یا در اصطلاح سونداژ  مجرای اشکی قابل درمان است؛ اما درسنین بالاتر سونداژ فقط جنبه تشخیصی دارد و به هیچ وجه برای درمان توصیه  نمی شود. لذا در بزرگسالان برای درمان انسداد مجرای اشکی یك عمل جراحی به نام داکریوسیستورینوستومی (DCR ) انجام می شود که طی آن مجرای اشکی مستقیما به داخل بینی باز میشود.\n" +
                        "روش جراحی:\n" +
                        "به این صورت است که برای رسیدن به کیسه اشکی برش کوچکی در ناحیه بین چشم و بینی، روی پوست قسمت بیرونی بینی داده میشود. سپس قطعه کوچکی از استخوان بین کیسه اشکی و بینی برداشته میشود. در این مرحله، روی کیسه اشکی برش داده شده و لبه های برش به نحوی به مخاط داخلی بینی دوخته میشود که ارتباط مستقیمی بین کیسه اشکی و بینی برقرار شود. معمولا طی\n" +
                        "این عمل، یك لوله سیلیکونی نیز به طورموقت در مجرا جایگذاری میشود تا از انسداد مجدد مجرا پس از عميل جراحی جلوگیری کند. این لوله درد ندارد و برای بیمار مشکلی ایجاد نمیکند.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("کاتاراکت (آب مروارید):cataract");
                fragment.SetBody("ماهیت بیماری:\n" +
                        "آب مروارید یا   cataractنوعی بیماری چشم با دلایل گوناگون است که با تار شدن عدسی چشم آغاز شده و با\n" +
                        "افزایش تیرگی و کدر شدن عدسی، بینایی چشم مختل میشود .خوشبختانه بیماری چشمی آب مروارید در بیشتر موارد\n" +
                        "در زمانی که به آن \" زمان رسیدن \" میگویند با جراحی سادهای برطرف میشود.\n" +
                        "عوامل مستعدکننده و علائم و نشانه ها:\n" +
                        "علاثم کاتاراکت شامل :\n" +
                        " \tتاری دید\n" +
                        " \tکاهش حدت بینایی\n" +
                        " \tنزدیک بینی\n" +
                        " \tتیرگی رنگها\n" +
                        " \tایجاد نقطه های نورانی در میدان دید\n" +
                        "این بیماری به دلایل زیر بروز میکند:\n" +
                        " \tکهولت سن (شایعترین علت)\n" +
                        " \tضربه به سر که موجب اخلال در تغذیه عدسی میشود\n" +
                        " \tاشعه های یونیزه (اشعه )x\n" +
                        " \tاشعه گامای ناشی از تلویزیونهای قدیمی\n" +
                        " \tتماس طولانی با نور آفتاب (پرتو فرابنفش)\n" +
                        " \tدیابت\n" +
                        " \tضربه به چشم و عدسی\n" +
                        " \tنقصانهای مادرزادی\n" +
                        " \tسوءتغذیه\n" +
                        " \tمصرف طولانی مدت بعضی از داروها مثل کورتونها\n" +
                        "روشهای تشخیصی:\n" +
                        "معاینه دقیق توسط چشم پزشک میتواند وجود و وسعت آب مروارید، و همچنین هر گونه مشکل دیگری که باعث\n" +
                        "کاهش دید یا ناراحتی می شود را مشخص کند. ممکنست علل دیگری علاوه بر آب مروارید بویژه مشکلات پرده\n" +
                        "شبکیه و یا عصب بینایی باعث کاهش دید شود. چنانچه این مشکلات وجود داشته باشد، بعد از عمل آب مروارید\n" +
                        "ممکنست دید کامل به دست نیاید. در صورتیکه این مشکلات شدید باشد، حتی عمل آب مروارید نیز ممکنست باعث\n" +
                        "بهبود دیده نشود. چشم پزشک میتواند به شما بگوید که چقدر احتمال دارد این مشکلات در چشم شما وجود داشته\n" +
                        "باشد.\n" +
                        "روشهای درمان\n" +
                        "در گذشته جراح چشم عدسی را وقتی کاملاً کدر شده بود از چشم خارج میکرد و دید را با عینک اصلاح مینمود. اما\n" +
                        "امروزه متخصصان میگویند بهتر است قبل از اینکه عدسی کاملاً سفت شود عمل جراحی انجام گیرد.\n" +
                        "در روشی جدیدتر موسوم به اکسترنال از لنزی که از جنس کریستال و گونهای پلاستیک است استفاده میشود و هنوز\n" +
                        "نیز کاربرد دارد. در این روش لنز مصنوعی جایگزین عدسی چشم میشود.\n" +
                        "تازهترین روش درمان آب مروارید عمل فیکو است. این روش هم برمبنای جایگزینی لنز به جای عدسی است، اما لنز\n" +
                        "مورد نیاز از جنس پلاستیک شفاف و قابل انعطاف یا به اصطلاح تاشو ( (foldableاست که آن را توسط ابزار ویژهای\n" +
                        "لوله کرده و از سوراخی در قرنیه به اندازه  ۳میلیمتر وارد کپسول عدسی قبلی که اکنون از چشم خارج شدهاست میکنند\n" +
                        "و لنز درون کپسول باز میشود و به حالت مطلوب درمیآید.\n" +
                        "درمان:\n" +
                        "تنها راه درمان آب مروارید جراحی است. بهر حال چنانچه علائم آب مروارید خفیف باشد تغییر نمره عینک ممکنست\n" +
                        "موقتا مشکلات شما را حل نماید. هیچگونه دارو، روش تغذیه، ورزش یا وسائل نوری وجود ندارد که باعث درمان یا4\n" +
                        "جلوگیری از آب مروارید شوند. دوری از نور خورشید ممکن است به جلوگیری یا کند شدن پیشرفت آب مروارید کمک\n" +
                        "کند. عینکهای آفتابی که نور ماورا بنفش را جذب می کنند یا عینکهای طبی با یک پوشش ضد اشعه ماورا بنفش باعث\n" +
                        "حفاظت چشم می شوند.\n" +
                        "عوارض عمل جراحی آب مروارید\n" +
                        "عمل جراحی آبمروارید یکی از شایعترین و سالمترین اعمال جراحی در تمام بدن محسوب میگردد، با این حال باید\n" +
                        "توجه داشت که به مانند تمامی اعمال جراحی نمیتواند به صورت مطلق خالی از عارضه باشد. همانطور که میدانیم هر\n" +
                        "گونه مداخله طبی و یا جراحی میتواند عوارض ریز و درشتی را به دنبال داشته باشد. بنابراین آنچه در انتخاب یک\n" +
                        "روش جراحی و یا طبی باید مدنظر باشد صرفاً وجود یا عدم وجود عارضه نیست، بلکه نسبت فوائد به عوارض آن روش\n" +
                        "باید معیار تصمیمگیری قرار گیرد. در عمل جراحی آب مروارید این نسبت بسیار بالاست به طوری که بیش از  ۵۹درصد\n" +
                        "موارد درمان جراحی آب مروارید بدون هیچگونه عارضهای خاتمه مییابد.\n" +
                        "باید توجه داشت که عدم بهبود بینایی پس از عمل جراحی آب مروارید همیشه دلالت بر وجود عارضه در ضمن یا پس\n" +
                        "از عمل ندارد، بلکه در مواردی بیماریهای همراه مانند کدورتهای قرنیه، آب سیاه، بیماریهای عصب و شبکیه، به\n" +
                        "صورت عوامل محدود کننده بینایی نقش بازی میکنند.\n" +
                        "عوارض احتمالی حین عمل عبارتند از:\n" +
                        "*از دست دادن قسمت یا تمام لایه پشت عدسی\n" +
                        "* باقی ماندن بخشی از عدسی در داخل چشم\n" +
                        "* افتادن تمام یا قسمتی از هسته عدسی بداخل زجاجیه\n" +
                        "* خونریزی پشت چشم\n" +
                        "در صورت بروز عوارض فوق که بسیار نادر هستند، ممکن است عمل جراحی با موفقیت و بدون تغییر روش جراحی به\n" +
                        "اتمام برسد و این احتمال هم وجود دارد که این عوارض سبب تغییر روش جراحی از نوع با برش کوچک به نوع با برش\n" +
                        "بزرگ و طبعاً استفاده از بخیه گردد. همچنین با بروز بعضی از عوارض فوق، بیمار ممکن است نیاز به جراحیهای\n" +
                        "تکمیلی دیگر پیدا نماید. خونریزی پشت چشم که بسیار عارضه نادری است میتواند منجر به از دست رفتن دائمی\n" +
                        "بینایی گردد.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("التهاب لوزه های کامی(آدنوتانسیلکتومی) Tonsillectomy");
                fragment.SetBody("تونسیلیت به معنی التهاب لوزه های کامی و آدنوئیدیت به معنی عفونت لوزه سوم یا لوزه حلقی است. بطور طبیعی در\n" +
                        "سنین زیر  ٣سال لوزه ها به پیشگیری از انتشار عفونت از سینوسها ،دهان و گلو به سایر قسمتهای بدن کمک می کنند.\n" +
                        "بزرگی لوزه ها می تواند باعث تجمع مایع در پشت پرده گوش و عفونتهای مکرر گوش شود این عمل در پاسخ به وقوع\n" +
                        "مکرر التهاب لوزه، جراحی درمانی آپنه انسدادی خواب، انسداد راههای هوایی یا آبسه دور لوزه انجام میشود.\n" +
                        "در کودکان لوزه سوم نیز همراه با این عمل جراحی برداشته میشود که به آن آدنوئیدکتومی (Adenoidectomy)\n" +
                        "و در صورتی که همراه با برداشتن لوزه باشد به آن تانسیلوآدنوئیدکتومی ( (Tonsilloadenoidectomyگفته\n" +
                        "میشود.\n" +
                        "علائم و نشانه ها:\n" +
                        " \tلوزه های قرمز یا متورم\n" +
                        " \tنقاط سفید روی لوزه ها\n" +
                        " \tدرد گردن یا تورم گردن\n" +
                        " \tگلودرد\n" +
                        " \tمشکل در بلع غذا\n" +
                        " \tسرفه\n" +
                        " \tسردرد\n" +
                        " \tچشم درد\n" +
                        " \tدرد عمومی بدن\n" +
                        " \tگوش درد\n" +
                        " \tتب\n" +
                        " \tاحساس لرز\n" +
                        " \tگرفتگی بینی\n" +
                        "روشهای تشخیصی:\n" +
                        "تانسیلکتومی زمانی برای بیمار کاربرد دارد که وی سابقه تجربه عفونتهای مکرر لوزه را داشته باشد. دفعات\n" +
                        "التهاب باید بیش از سه بار باشد\n" +
                        "نشانه های مطلق: بزرگ شدن لوزههای که منجر به انسداد راههای هوایی فوقانی شود، دیسفاژی شدید\n" +
                        "(سختی در بلع)، اختلالات خواب و یا عوارض قلبی، التهابات لوزه منجر به تب و تشنج\n" +
                        "نشانه های نسبی: بوی بد دهان، اختلال در گفتار، سه بار یا بیشتر عفونت لوزه در هر سال با وجود درمان\n" +
                        "پزشکی کافی، ورم مداوم یا مکرر یک حامل استرپتوکوکی در پاسخ به آنتی بیوتیک، هایپرتورفی لوزهها که یک\n" +
                        "طرفه میباشد و بافت سرطانی فرض میشود.\n" +
                        "درمان\n" +
                        "درمان شامل کم کردن علائم تورم لوزه هاست:\n" +
                        " کم کردن درد، التهاب و سرخی گلو و لوزه ها، کاهش تب (با تجویز استامینوفن، ایبوبروفن،\n" +
                        " کم کردن سرفه با استفاده از قرقره آب نمک،\n" +
                        "اگر تورم لوزه ها به دلیل استرپتوکوک باشد، آنگاه آنتی بیوتیک هایی مانند آمپی سیلین و آموکسی سیلین مفید خواهند\n" +
                        "بود. یک ماکرولید مانند اریترومایسین برای کسانی که به آمپی سیلین آلرژی دارند مفید خواهد بود. کسانیکه بدنشان به\n" +
                        "آمپی سیلین ها جواب نمی دهد میتوانند از کوآموکسی کلاو یا کلیندامایسین استفاده کنند. اگر تورم لوزه ها به دلیل\n" +
                        "ویروس باشد، طول درمانش بستگی به نوع ویروس دارد . معمولاً بین یک تا دو هفته است . اما ممکن است بیماری\n" +
                        "وخیم شده و نیاز به برداشتن لوزه ها توسط جراحی باشد.\n" +
                        "اقدامات قبل از عمل جراحی:\n" +
                        " \tاخذ شرح حال دقیق از بیمار ، بیماری های زمینه ای قبلی و سابقه پزشکی و حساسیت های غذایی و\n" +
                        " \tدارویی\n" +
                        " \tاخذرضایت عمل از بیمار و خانواده\n" +
                        " \tآموزش به بیمار در خصوص فرایند عمل جراحی و آماده کردن او جهت کاهش استرس قبل از عمل\n" +
                        " \tمنع از خوردن و آشامیدن؛ حدود  12ساعت قبل از عمل\n" +
                        " \tسایر امادگی های قبل از عمل از جمله نداشتن وسیله فلزی، مصنوعی و لباس های زیر\n" +
                        " \tشروع محلولهای وریدی یا سرم تزریقی ودرمان آنتی بیوتیکی طبق صلاحدید پزشک\n" +
                        " \tثبت تمام شرایط و حالات در گزارش پرستاری\n" +
                        " \tچک علایم حیاتی قبل انتقال به اتاق عمل\n" +
                        " \tآزمایش خون (کنترل زمان انعقاد خون)\n" +
                        " \tکنترل وجود دندان لق\n" +
                        " \tخودداری از مصرف آسپرین، ایبوپروفن، ناپروکسن، وارفارین و دیگر داروهای مشابه.\n" +
                        "اقدامات بعد از عمل جراحی:\n" +
                        " \tچک علایم حیاتی وکنترل ته حلق از نظر خونریزی بلع مکرر، تغییررنگ بزاق و ترشح خونی از بینی و یا استفراغ خونی\n" +
                        " \tپس از به هوش آمدن بیمار در وضعیت نیمه نشسته قرار می دهنددرصورتی که زیرسر  45درجه و چرخاندن سر به یک سمت\n" +
                        " \tادامه سرم تراپی و آنتی بیوتیک درمانی و استفاده از مسکن در صورت لزوم طبق دستور پزشک\n" +
                        " \tشروع رژیم مایعات سردو بستنی برای کاهش احتمال خونریزی بعد هوشیاری کامل و سمع صداهای روده\n" +
                        " \tکنترل تهوع واستفراغ پس از عمل\n" +
                        " \tدرصورت خونریزی شدید اطلاع به پزشک\n" +
                        "خطرات و عوارض احتمالی \n" +
                        "خطرات بیهوشی: واکنش به داروهای بیحس کننده اختلالات تنفسی \n" +
                        "خطرات جراحی: خونریزی در حین عمل جراحی تورم: تورم زبان و کام نرم. این تورم باعث اختلالات تنفسی در\n" +
                        "چند ساعت ابتدایی بعد از عمل میشود.عفونت بعد از جراحی که بسیار نادر است و نیاز به درمان دارد.\n" +
                        "آموزش به بیمار\n" +
                        " \tمایعات، مهمترین غذایی است که بیمار پس از عمل باید مصرف کند و همین مساله میتواند تب و یبوست را کاهش\n" +
                        " \tدهد و بهبود را حاصل کند.. مایعات سبک، آبمیوه، شربت و ژله، غذاهای مناسبی هستند که بیمارمیتواند در طول این\n" +
                        " \tمدت از آنها تغذیه کند. در این میان، غذاهای نرم و مایعات خنک راحتتر بلعیده میشوند.\n" +
                        " \tاز مایعات سردو صاف شده مثل آب میوه ای که ترش شور وتندو یا تحریک کننده نیستندو نوشیدنیهای\n" +
                        " \tبدون کافثین و بدون گاز استفاده کرد\n" +
                        " \tداروهای تجویز شده توسط پزشک را در منزل طبق ساعتهای دستور داده شده بطور دقیق مصرف نمائید.\n" +
                        " \tممکن است روز اول بیمار دچار تب شود که می توان برای کنترل آن از استامینوفن استفاده کرد.مصرف آسپرین\n" +
                        " \tممنوع است.\n" +
                        " \tهرگز به کودک آسپیرین و یا داروهای حاوی آسپیرین را ندهید. آسپیرین خطر خونریزی را در طی عمل جراحی و\n" +
                        " \tیا بعد از آن افزایش می دهد و خطر ابتلا به بیماری خطرناک سندرم ری را زیاد می کند.\n" +
                        " \tاز مصرف غذاهای سفت که باعث خراش در حلق و محل عمل می شود تا مدت  1ا روز خودداری شود.\n" +
                        " \tاز دستکاری حلق و غشای فیبری ایجاد شده برروی لوزه خودداری شود. غشای فیبری سفیدرنگ به طور طبیعی می\n" +
                        " \tتواند تا چندین روز پس از عمل دیده شود و نشانه عفونت محل عمل نیست.\n" +
                        " \tدر  ٣ روز اول پس از عمل بیمار باید استراحت بیشتری داشته باشدو تا  11روز از مانور والسالوا (اقداماتی که باعث\n" +
                        " \tافزایش فشار داخل شکمی می شوند مثل زورزدن) و فعالیتهای سنگین خودداری کند.\n" +
                        " \tدر صورت مشاهده هرگونه خونریزی تاخیری که معمولا روز پنجم بعد از عمل رخ می دهد فورا به پزشک معالج خود\n" +
                        " \tمراجعه نماید.\n" +
                        " \tخونریزی محل جراحی از شایع ترین مشکلات بعد از عمل جراحی لوزه هاست.5\n" +
                        " \tکم آبی بدن و فعالیت زیاد بدنی بعد از عمل جراحی، خطر خونریزی را افزایش می دهد.\n" +
                        " \tدر بیشتر موارد، خونریزی نسبتا خفیف است. فقط تعداد کمی از کودکان برای قطع خونریزی، نیاز به جراحی مجدد و\n" +
                        " \tیا تزریق خون پیدا می کنند.\n" +
                        " \tخونریزی محل جراحی بیشتر مواقع طی  7تا  14روز بعد از عمل رخ می دهد، اما می تواند تا  21روز بعد از عمل نیز\n" +
                        " \tدیده شود.\n" +
                        " \tبهتر است در صورت خونریزی، تا سه هفته بعد از جراحی به جاهای دور مسافرت نکنید. اکیدا توصیه می شود طی\n" +
                        " \tاین مدت به خارج از کشور و یا مناطق دوردست نروید.\n" +
                        " \tاگر کودک دچار خونریزی شد، بهتر است کمی یخ بمکد و یا آب سرد بنوشد. سپس دراز بکشد و زیر سرش چند تا\n" +
                        " \tبالش قرار دهد تا سرش بالا قرار بگیرد.\n" +
                        " \tاگر مقدار خونریزی زیاد بود ( بیشتر از یک تا دو قاشق مرباخوری پر) و یا بیش از  5دقیقه ادامه داشت، به اورژانس\n" +
                        " \tکودک را سریعا به بیمارستان برساند.\n" +
                        " \tعفونت\n" +
                        " \tمعمولا بعد از عمل جراحی لوزه ها، عفونتی رخ نمی دهد .درد فزاینده و تب از نشانه های ابتلا به عفونت هستند.\n" +
                        " \tعلایم هشداردهنده بیماری و پیگیری و مراجعه مجدد) :\n" +
                        " \tدر موارد زیر نیز کودک را به همان بیمارستانی که در آنجا عمل شده است، و یا به نزدیک ترین بیمارستان محل زندگی\n" +
                        " \tخودتان برسانید:\n" +
                        " \tاگر کودک به طور مداوم استفراغ می کرد و نمی توانست مایعی بنوشد.\n" +
                        " \tاگر کودک درد داشت و درد او با مصرف داروهای مسکن تجویزشده توسط پزشک برطرف نمی شد.\n" +
                        " \tاگر کودک بیش از  4ساعت، تب بالای 38 درجه داشت.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                InfoIllness fragment = new InfoIllness();
                fragment.SetTitle("ناخنک یا پتریژیوم pterygium pteryg");
                fragment.SetBody("ناخنک یا پتریژیوم ، یک ضایعه گوشتی مثلثی شکل است که از سفیدی چشم (ملتحمه) روی سیاهی چشم (قرنیه) کشیده\n" +
                        "میشود. معمولا در طرف بینی چشم است. این ضایعه ناشی از رشد خوشخیم بافت پیوندی و رگهای ملتحمه است. ناخنک\n" +
                        "معمولاً ابتدا به صورت یک سفیدی روی ملتحمه ایجاد میشود که به تدریج به سمت قرنیه رشد میکند. به علت وجود\n" +
                        "رگهای زیاد معمولاً رنگ ناخنک صورتی یا قرمز است. ناخنک گاهی ملتهب میشود و باعث سوزش و خارش و اشکریزش\n" +
                        "میشود. گاهی اوقات ناخنک رشد زیادی میکند و تا وسط قرنیه میرسد و جلوی دید را میگیرد. به علاوه حتی\n" +
                        "ناخنکهای کوچکتر هم میتوانند با تغییر شکل قرنیه باعث ایجاد آستیگماتیسم شوند و دید افراد را تار کنند.2\n" +
                        "علائم\n" +
                        "عبارتند ازالتهاب، سوزش،خارش و اشکریزش چشم.\n" +
                        "گاهی اوقات ناخنک رشد زیادی می کند و تا وسط قرنیه می رسد و جلوی دید را می گیرد. به علاوه حتی ناخنک های\n" +
                        "کوچکتر هم می توانند با تغییر شکل قرنیه باعث ایجاد آستیگماتیسم شوند و دید افراد را تار کنند.\n" +
                        "اشعه ماوراء بنفش خورشید همچنین باد شدید و گرد و خاک با تحریک چشم در ایجاد ناخنک مؤثر میباشد.\n" +
                        "بنابراین توصیه میشود افرادی که در مناطق آفتابی زندگی میکنند و مدت زیادی در معرض تابش آفتاب هستند از کلاه\n" +
                        "لبهدار و عینک آفتابی استفاده کنند.در افرادی که ناخنک دارند معمولاً ورود آب به چشمها (در موقع شستن دست و صورت\n" +
                        "یا حمام کردن) باعث تحریک چشم و ایجاد سوزش و قرمز شدن چشمها میشود. بنابراین این افراد باید دقت کنند که حتی\n" +
                        "الامکان آب وارد چشمشان نشود .\n" +
                        "درمان ومراقبتهای پرستاری\n" +
                        " \tاگر ناخنک کوچک باشد و ظاهر ناخوشایندی نداشته باشد و باعث قرمزی و سوزش چشمها نشود نیاز به درمان خاصی\n" +
                        " \tندارداگر ناخنک گهگاه ملتهب شود و سوزش و قرمزی چشم ایجاد کند مصرف قطرههای اشک مصنوعی به صورت مکرر\n" +
                        " \tممکن است باعث تسکین علائم شود.\n" +
                        " \tدر مواردی که ناخنک التهاب شدیدی دارد میتوان با نظر چشم پزشک یک دوره درمان با قطرههای استروئیدی یا سایر\n" +
                        " \tقطرههای ضد التهاب انجام داددر مورد ناخنکهای بزرگتر که از لحاظ ظاهری و زیبایی اهمیت دارند و یا با ایجاد\n" +
                        " \tآستیگماتیسم باعث تاری دید شدهاند میتوان با جراحی ناخنک را برداشت.\n" +
                        " \tالبته اگر ناخنک به صورت ساده برداشته شود احتمال عود آن زیاد است و به خصوص در افراد جوان و افرادی که ناخنک\n" +
                        " \tملتهب دارند در نیمی از موارد، عود دیده میشود. در این افراد بهتر است علاوه بر برداشتن ناخنک از روشهای تکمیلی مثل\n" +
                        " \tپیوند ملتحمه یا استفاده از داروهای خاص (مثلا میتومایسین) در حین جراحی استفاده شود.\n" +
                        " \tدر ناخنکهای خیلی بزرگ که وسط قرنیه را هم درگیر کردهاند ممکن است لازم باشد علاوه بر اقدامات فوق از پیوند\n" +
                        " \tقرنیه لایهای برای اصلاح شکل قرنیه استفاده شود.\n" +
                        " \tلازم به ذکر است که برخی از تومورهای چشمی ممکن است در ابتدا با ناخنک اشتباه شوند. پس در مواردی که ناخنک\n" +
                        " \tرشد خیلی سریعی دارد و یا مکرراً عود میکند حتماً باید با چشم پزشک مشورت کنیم.\n" +
                        " \tناخنک چشم خغیف ترین عارضه اشعه ماورای بنغش نور آفتاب است وقرار گرفتن طولانی مدت در معرض نور آفتاب،\n" +
                        " \tبدون استفاده از عینک آفتابی، از علل مهم بروز آن است.\n" +
                        " \tکشاورزان و کارگران ساختمانی به علت حضور دائم و طولانی مدت در فضاهای باز (در معرض نور آفتاب) مستعد ابتلا به\n" +
                        " \tناخنک چشمی هستند.\n" +
                        " در مراحل اولیه بیماری، قطره های چشمی ضد التهابی، قرمزی و ناراحتی چشم را کنترل می کنند. در صورت درگیری\n" +
                        "قرنیه (بیشتر از  2میلیمتر،) ناراحتی بیماریا مشکل زیبایی، این ضایعه باید با عمل جراحی برداشته شود.\n" +
                        "داروهای ضد ناخنک بسیار سمی می باشند، لذا در صورت تجویز پزشک بایستی مرتبا فرد توسط پزشک ویزیت شود تا از\n" +
                        "عوارض دارو جلوگیری شود.\n" +
                        "قطره های چشمی ضد عفونت و ضد التهاب بنا بر صلاحدید پزشک، تا چندین هفته پس از عمل جراحی پاید توسط بیمار\n" +
                        "استفاده شوند. قرمزی مختصر در ناحیه عمل شده معمولا ظرف  2تا  ٣ماه به طور کامل از بین می رود. ازمصرف قطره\n" +
                        "های مختلف بدون تجویز چشم پزشک جدا خودداری نمایید .\n" +
                        " تا حد ممکن از کار طولانی مدت در محیط های گرم و خشک و دارای گرد و غبار پرهیز شود.\n");
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();

            }
        });



        return v;
    }

}
