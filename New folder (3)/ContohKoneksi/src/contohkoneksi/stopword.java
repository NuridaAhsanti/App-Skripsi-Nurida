/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author nury
 */
public class stopword {
    public static String[] stopWordsofwordnet = {
" a", " about", " adalah", " after", " agak", " agar", " akan", " akibat", " akibatnya", " all", 
" also", " amatlah", " an", " and", " another", " antara", " any", " apa", " apa", " apabila", 
" apakah", " apalagi", " are", " as", " at", " atau", " b", " bagai", " bagai", " bagaikan", 
" bagaimana", " bagi", " bahkan", " bahwa", " bahwa", " be", " because", " been", " before", 
" beginian", " begitu", " being", " belum", " berdatangan", " berlainan", " bersama", " betulkah", 
" between", " biar", " biarpun", " bila", " bilamana", " bolehkah", " both", " but", " by", " c", 
" came", " can", " caranya", " come", " contoh", " could", " d", " dalam", " dan", " dapat", 
" dari", " daripada", " daripada", " demi", " demikian", " dengan", " di", " did", " dikarenakan", 
" dimana", " dimungkinkan", " diperlukan", " dirinya", " do", " does", " e", " each", " else", 
" f", " for", " from", " g", " get", " got", " h", " had", " hanya", " hanyalah", " has", " have", 
" he", " hendaknya", " her", " here", " him", " himself", " hingga", " his", " how", " i", " ialah", 
" ibarat", " in", " ini", " into", " is", " it", " its", " itu", " j", " jadi", " jangan", " jika", 
" jikalau", " juga", " just", " justru", " k", " kalau", " karena", " karena", " karenanya", " ke", 
" kecuali", " kemudian", " kenapa", " kepada", " ketika", " kok", " l", " lagi", " lagipula", 
" lainnya", " lalu", " like", " m", " maka", " make", " mampukah", " many", " masih", " maupun", 
" maupun", " me", " melainkan", " memang", " meski", " meskipun", " might", " misalnya", " more", 
" most", " much", " mungkin", " must", " my", " n", " namun", " never", " now", " o", " of", " oleh", 
" on", " only", " or", " other", " our", " out", " over", " p", " pada", " padahal", " paling", 
" pastilah", " pertanyaan", " pula", " pun", " q", " r", " re", " s", " saat", " said", " saja", 
" sambil", " same", " sampai", " sangat", " sangat", " sebab", " sebagai", " sebagai", " sebagaimana", 
" sebaliknya", " sebegitu", " sebelum", " sebuah", " sedang", " sedangkan", " sedari", " see", 
" segera", " sehingga", " sejak", " sekalipun", " sekarang", " sekurangnya", " selain", " selama", 
" seluruhnya", " semakin", " semenjak", " sementara", " semisal", " sepanjang", " sepantasnyalah", 
" seperti", " sering", " serta", " sesudah", " setelah", " should", " since", " so", " some", 
" still", " such", " sudah", " sudah", " supaya", " t", " take", " tanpa", " tapi", " telah", 
" telah", " tentang", " tentang", " terhadap", " terlalu", " tersebut", " tersebutlah", " terus", 
" tetapi", " than", " that", " the", " their", " them", " then", " there", " these", " they", " this", 
" those", " through", " to", " too", " u", " umpama", " under", " untuk", " up", " use", " v", " very", 
" w", " walau", " walaupun", " want", " was", " way", " we", " well", " were", " what", " when", 
" where", " which", " while", " who", " will", " with", " would", " x", " y", " yaitu", " yakni", 
" you", " your", " z", "ada", "adalah", "adanya", "adapun", "agaknya", "agar", "akan", "akankah", 
"akhir", "akhiri", "akhirnya", "aku", "akulah", "amat", "anda", "andalah", "antar", "antara", 
"antaranya", "apaan", "apabila", "apakah", "apalagi", "apatah", "artinya", "asal", "asalkan", 
"atas", "atau", "ataukah", "ataupun", "awal", "awalnya", "bagaikan", "bagaimana", "bagaimanakah", 
"bagaimanapun", "bagi", "bagian", "bahkan", "bahwasanya", "baik", "bakal", "bakalan", "balik", 
"banyak", "bapak", "baru", "bawah", "beberapa", "begini", "beginikah", "beginilah", "begitu", 
"begitukah", "begitulah", "begitupun", "bekerja", "belakang", "belakangan", "belum", "belumlah", 
"benar", "benarkah", "benarlah", "berada", "berakhir", "berakhirlah", "berakhirnya", "berapa", 
"berapakah", "berapalah", "berapapun", "berarti", "berawal", "berbagai", "beri", "berikan", 
"berikut", "berikutnya", "berjumlah", "berkali-kali", "berkata", "berkehendak", "berkeinginan", 
"berkenaan", "berlalu", "berlangsung", "berlebihan", "bermacam", "bermacam-macam", "bermaksud", 
"bermula", "bersama", "bersama-sama", "bersiap", "bersiap-siap", "bertanya", "bertanya-tanya", 
"berturut", "berturut-", "bertutur", "berujar", "berupa", "besar", "betul", "biasa", "biasanya", 
"bila", "bilakah", "bisa", "bisakah", "boleh", "bolehlah", "buat", "bukan", "bukankah", "bukanlah", 
"bukannya", "bulan", "bung", "cara", "cukup", "cukupkah", "cukuplah", "cuma", "dahulu", "dalam", 
"dan", "dapat", "dari", "datang", "dekat", "demi", "demikian", "demikianlah", "dengan", "depan", 
"di", "dia", "diakhiri", "diakhirinya", "dialah", "diantara", "diantaranya", "diberi", "diberikan", 
"diberikannya", "dibuat", "dibuatnya", "didapat", "didatangkan", "digunakan", "diibaratkan", 
"diibaratkannya", "diingat", "diingatkan", "diinginkan", "dijawab", "dijelaskan", "dijelaskannya", 
"dikatakan", "dikatakannya", "dikerjakan", "diketahui", "diketahuinya", "dikira", "dilakukan", 
"dilalui", "dilihat", "dimaksud", "dimaksudkan", "dimaksudkannya", "dimaksudnya", "diminta", 
"dimintai", "dimisalkan", "dimulai", "dimulailah", "dimulainya", "dini", "dipastikan", "diperbuat", 
"diperbuatnya", "dipergunakan", "diperkirakan", "diperlihatkan", "diperlukannya", "dipersoalkan", 
"dipertanyakan", "dipunyai", "diri", "disampaikan", "disebut", "disebutkan", "disebutkannya", 
"disini", "disinilah", "ditambahkan", "ditandaskan", "ditanya", "ditanyai", "ditanyakan", "ditegaskan", 
"ditujukan", "ditunjuk", "ditunjuki", "ditunjukkan", "ditunjukkannya", "ditunjuknya", "dituturkan", 
"dituturkannya", "diucapkan", "diucapkannya", "diungkapkan", "dong", "dua", "dulu", "empat", "enggak", 
"enggaknya", "entah", "entahlah", "guna", "gunakan", "hal", "hampir", "hanya", "hari", "harus", 
"haruslah", "harusnya", "hendak", "hendaklah", "hingga", "ia", "ialah", "ibarat", "ibaratkan", 
"ibaratnya", "ibu", "if", "ikut", "ingat", "ingat-ingat", "ingin", "inginkah", "inginkan", "ini", 
"inikah", "inilah", "itu", "itukah", "itulah", "jadi", "jadilah", "jadinya", "jangan", "jangankan", 
"janganlah", "jauh", "jawab", "jawaban", "jawabnya", "jelas", "jelaskan", "jelaslah", "jelasnya", 
"jika", "juga", "jumlah", "jumlahnya", "justru", "kala", "kalau", "kalaulah", "kalaupun", "kalian", 
"kami", "kamilah", "kamu", "kamulah", "kan", "kapan", "kapankah", "kapanpun", "kasus", "kata", 
"katakan", "katakanlah", "katanya", "ke", "keadaan", "kebetulan", "kecil", "kedua", "keduanya", 
"keinginan", "kelamaan", "kelihatan", "kelihatannya", "kelima", "keluar", "kembali", "kemudian", 
"kemungkinan", "kemungkinannya", "kepada", "kepadanya", "kesampaian", "keseluruhan", "keseluruhannya", 
"keterlaluan", "ketika", "khususnya", "kini", "kinilah", "kira", "kira-kira", "kiranya", "kita", 
"kitalah", "kurang", "lagi", "lagian", "lah", "lain", "lainnya", "lalu", "lama", "lamanya", "lanjut", 
"lanjutnya", "lebih", "lewat", "lima", "luar", "macam", "maka", "makanya", "makin", "malah", "malahan", 
"mampu", "mana", "manakala", "manalagi", "masa", "masalah", "masalahnya", "masih", "masihkah", 
"masing", "masing-masing", "mau", "maupun", "melainkan", "melakukan", "melalui", "melihat", "melihatnya", 
"memang", "memastikan", "memberi", "memberikan", "membuat", "memerlukan", "memihak", "meminta", "memintakan", 
"memisalkan", "memperbuat", "mempergunakan", "memperkirakan", "memperlihatkan", "mempersiapkan", 
"mempersoalkan", "mempertanyakan", "mempunyai", "memulai", "memungkinkan", "menaiki", "menambahkan", 
"menandaskan", "menanti", "menantikan", "menanti-nanti", "menanya", "menanyai", "menanyakan", 
"mendapat", "mendapatkan", "mendatang", "mendatangi", "mendatangkan", "menegaskan", "mengakhiri", 
"mengapa", "mengatakan", "mengatakannya", "mengenai", "mengerjakan", "mengetahui", "menggunakan", 
"menghendaki", "mengibaratkan", "mengibaratkannya", "mengingat", "mengingatkan", "menginginkan", 
"mengira", "mengucapkan", "mengucapkannya", "mengungkapkan", "menjadi", "menjawab", "menjelaskan", 
"menuju", "menunjuk", "menunjuki", "menunjukkan", "menunjuknya", "menurut", "menuturkan", "menyampaikan", 
"menyangkut", "menyatakan", "menyebutkan", "menyeluruh", "menyiapkan", "merasa", "mereka", "merekalah", 
"merupakan", "meski", "meskipun", "meyakini", "meyakinkan", "minta", "mirip", "misal", "misalkan", 
"misalnya", "mula", "mulai", "mulailah", "mulanya", "mungkinkah", "nah", "naik", "namun", "nanti", 
"nantinya", "nyaris", "nyatanya", "oleh", "olehnya", "pada", "padahal", "padanya", "pak", "paling", 
"panjang", "pantas", "para", "pasti", "penting", "pentingnya", "per", "percuma", "perlu", "perlukah", 
"perlunya", "pernah", "persoalan", "pertama", "pertama-tama", "pertanyakan", "pihak", "pihaknya", 
"pukul", "pula", "pun", "punya", "rasa", "rasanya", "rata", "rupanya", "saat", "saatnya", "saja", 
"sajalah", "saling", "sama", "sama-sama", "sambil", "sampai", "sampaikan", "sampai-sampai", "sana", 
"sangatlah", "satu", "saya", "sayalah", "se", "sebab", "sebabnya", "sebagaimana", "sebagainya", 
"sebagian", "sebaik", "sebaik-baiknya", "sebaiknya", "sebaliknya", "sebanyak", "sebegini", "sebelum", 
"sebelumnya", "sebenarnya", "seberapa", "sebesar", "sebetulnya", "sebisanya", "sebuah", "sebut", 
"sebutlah", "sebutnya", "secara", "secukupnya", "sedang", "sedangkan", "sedemikian", "sedikit", 
"sedikitnya", "seenaknya", "segala", "segalanya", "segera", "seharusnya", "sehingga", "seingat", 
"sejak", "sejauh", "sejenak", "sejumlah", "sekadar", "sekadarnya", "sekali", "sekalian", "sekaligus", 
"sekali-kali", "sekarang", "sekarang", "sekecil", "seketika", "sekiranya", "sekitar", "sekitarnya", 
"sekurang-kurangnya", "sela", "selain", "selaku", "selalu", "selama", "selama-lamanya", "selamanya", 
"selanjutnya", "seluruh", "semacam", "semakin", "semampu", "semampunya", "semasa", "semasih", "semata", 
"semata-mata", "semaunya", "sementara", "semisalnya", "sempat", "semua", "semuanya", "semula", "sendiri", 
"sendirian", "sendirinya", "seolah", "seolah-olah", "seorang", "sepantasnya", "seperlunya", "seperti", 
"sepertinya", "sepihak", "sering", "seringnya", "serta", "serupa", "sesudah", "sesaat", "sesama", 
"sesampai", "sesegera", "sesekali", "seseorang", "sesuatu", "sesuatunya", "sesudahnya", "setelah", 
"setempat", "setengah", "seterusnya", "setiap", "setiba", "setibanya", "setidaknya", "setidak-tidaknya", 
"setinggi", "seusai", "sewaktu", "siap", "siapa", "siapakah", "siapapun", "sini", "sinilah", "soal", 
"soalnya", "suatu", "sudahkah", "sudahlah", "supaya", "tadi", "tadinya", "tahu", "tahun", "tak", "tambah", 
"tambahnya", "tampak", "tampaknya", "tandas", "tandasnya", "tanpa", "tanya", "tanyakan", "tanyanya", 
"tapi", "tegas", "tegasnya", "tempat", "tengah", "tentu", "tentulah", "tentunya", "tepat", "terakhir", 
"terasa", "terbanyak", "terdahulu", "terdapat", "terdiri", "terhadap", "terhadapnya", "teringat", 
"teringat-ingat", "terjadi", "terjadilah", "terjadinya", "terkira", "terlebih", "terlihat", "termasuk", 
"ternyata", "tersampaikan", "tersebut", "tertentu", "tertuju", "terus", "terutama", "tetap", "tetapi", 
"tiap", "tiba", "tiba-tiba", "tidak", "tidakkah", "tidaklah", "tiga", "tinggi", "toh", "tunjuk", "turut", 
"tutur", "tuturnya", "ucap", "ucapnya", "ujar", "ujarnya", "umum", "umumnya", "ungkap", "ungkapnya", 
"untuk", "usah", "usai", "waduh", "wah", "wahai", "waktu", "waktunya", "walau", "walaupun", "wong", 
"yaitu", "yakin", "yakni", "yang"
};

public static ArrayList<String> wordsList = new ArrayList<>();

public static void main(int sa){
String s="Tulis program untuk menghitung resistor pengganti dari 3 buah resistor yang disusun secara seri atau paralel. Rumus untuk resistor pengganti sbb:";
s = s.trim().replaceAll("\\s+", " ");
String[] words = s.split(" ");

for (String word : words) {
wordsList.add(word);
}

//remove stop words here from the temp list
for (int i = 0; i < wordsList.size(); i++) {
// get the item as string
for (int j = 0; j < stopWordsofwordnet.length; j++) {
if (stopWordsofwordnet[j].contains(wordsList.get(i))) {
wordsList.remove(i);
}
}
}
for (String str : wordsList) {
System.out.print(str+" ");
}
}

}