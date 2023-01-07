package t14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandidateManager {

    private ArrayList<Candidate> candidates;

    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }

    /*
     * readData
     * Đọc dữ liệu từ file văn bản textFile và lưu dữ liệu vào các biến thành viên
     */
    public boolean readData(String textFile) {
        File file = null;
        Scanner fileReader = null;
        try {
            file = new File(textFile);
            fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String[] fields = fileReader.nextLine().trim().split("\\|");
                if (fields.length != 6) {
                    continue;
                }

                String id = fields[0].trim();
                String name = fields[1].trim();
                String selection = fields[2].trim();
                String sex = fields[3].trim();
                int year = Integer.parseInt(fields[4].trim());
                int priority = Integer.parseInt(fields[5].trim());

                Candidate newCandidate = new Candidate(id, name, selection, sex, year, priority);

                this.candidates.add(newCandidate);
            }
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }  finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }

    /*
     * getSelectionCandicates
     * Trả về danh sách các thí sinh có khối thi là selection
     */
    public ArrayList<Candidate> getSelectionCandicates(String selection) {
        /* TODO */
        ArrayList<Candidate> ncd = new ArrayList<>();
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).selection().equals(selection)){
                ncd.add(candidates.get(i));
            }
        }
        return ncd;
    }

    /*
     * getPriorityCandidates
     * Trả về danh sách thí sinh được ưu tiên (có độ ưu tiên bằng 1)
     */
    public ArrayList<Candidate> getPriorityCandidates() {
        /* TODO */
        ArrayList<Candidate> ncd1 = new ArrayList<>();
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).priority()==1){
                ncd1.add(candidates.get(i));
            }
        }
        return ncd1;
    }

    /*
     * sortByName
     * Trả về danh sách các thí sinh được sắp xếp theo họ và tên
     */
    public ArrayList<Candidate> sortByName() {
        /* TODO */
        ArrayList<Candidate> ncd2 = new ArrayList<>();
        for (int i = 0; i < candidates.size(); i++) {
           ncd2.add(candidates.get(i));
        }

        for (int i = 0; i < ncd2.size() ; i++) {
            for (int j = i+1; j < ncd2.size(); j++) {
                if (ncd2.get(i).name().compareTo(ncd2.get(j).name())>0) {
                    Candidate temp = ncd2.get(i);
                    ncd2.set(i, ncd2.get(j));
                    ncd2.set(j, temp);
                }
            }
        }
        return ncd2;
    }

    /*
     * getSecondYoungestCandidates
     * Trả về danh sách các thí sinh có tuổi trẻ thứ 2 trong danh sách
     *  (ví dụ: các khách hàng có các năm sinh 1990 1991 1992 1993,
     *  trả về danh sách các khách hàng sinh năm 1992)
     */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        /* TODO */
        ArrayList<Candidate> ncd3 = new ArrayList<>();
        int max = ncd3.get(0).year();
        int max2 = ncd3.get(0).year();
        for (int i = 0; i < ncd3.size(); i++) {
            if (candidates.get(i).year()>max){
                max2 = max;
                max = ncd3.get(i).year();
            }else if(candidates.get(i).year()>max2&&candidates.get(i).year()!=max){
                max2=candidates.get(i).year();
            }
        }
//        for (int i = 0; i < ncd3.size(); i++) {
//            if (candidates.get(i).year() != max && candidates.get(i).year() > max2 ){
//                    max2 = ncd3.get(i).year();
//            }
//        }

        ArrayList<Candidate> secYoungest = new ArrayList<>();
        for (int i = 0; i < ncd3.size(); i++) {
            if (candidates.get(i).year() == max2){
                secYoungest.add(candidates.get(i));
            }
        }
        return secYoungest;

    }

    /*
     * printCandidatesFromArray
     * In danh sách các thí sinh từ một List đã cho
     */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }

        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
            }
    }

    /*
     * printCandidates
     * In danh sách các thí sinh được lưu trong biến thành viên candidates
     */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }

    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("C:\\Users\\84368\\OneDrive\\Máy tính\\java\\Design Patterns\\lab12-master\\src\\t14\\candidates.txt")) {
            return;
        }

        ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
        candidateManager.printCandidatesFromArray(selectionCandidates);
        System.out.println();

        ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
        candidateManager.printCandidatesFromArray(priorityCandidates);
        System.out.println();

        ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        candidateManager.printCandidatesFromArray(sortedNameCandidates);
        System.out.println();

        ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
        candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }
}
