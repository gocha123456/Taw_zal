package com.example.subjectsApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class SubjectsDataBase {

    private List<SubjcetEntry> subjectsEntryList = new ArrayList<>();
    private int entryIndex = 1;

    public void addEntry(SubjcetEntry entry) {
        entry.setId(entryIndex);
        subjectsEntryList.add(entry);
        entryIndex = entryIndex+1;
    }


    public List<SubjcetEntry> getAllEntries(String calssroom, Boolean finals) {
        if(calssroom==null && finals==null){
            return subjectsEntryList;
        }
        List<SubjcetEntry> filteredEntries = new ArrayList<>();
        if(calssroom==null || finals==null){
            for(SubjcetEntry entry : subjectsEntryList){
                if(entry.getCalssroom().equals(calssroom) || entry.getFinals().equals(finals)){
                    filteredEntries.add(entry);
                }
            }
        } else {
            for(SubjcetEntry entry : subjectsEntryList){
                if(entry.getCalssroom().equals(calssroom) && entry.getFinals().equals(finals)){
                    filteredEntries.add(entry);
                }
            }
        }
        return filteredEntries;
    }

    public void deleteAll() {
        subjectsEntryList.clear();
    }

    public SubjcetEntry getEntryById(Integer id) {
        for(SubjcetEntry entry : subjectsEntryList){
            if(entry.getId().equals(id)){
                return entry;
            }
        }
        return null;
    }

    public void deleteEntryById(Integer id){
        subjectsEntryList.removeIf(entry -> entry.getId().equals(id));
    }
}
