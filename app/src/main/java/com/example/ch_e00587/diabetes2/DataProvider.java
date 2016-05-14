package com.example.ch_e00587.diabetes2;

/**
 * Created by krunal on 21/04/2016.
 */
public class DataProvider {
    private String _name;
    private String _dob;
    private int _bp;
    private int _cholestrol;
    private int _hypo;
    private int _glucose;

    public DataProvider(String name,String mob,String email)
    {
        this._name =_name;
        this._dob = _dob;
        this._bp = _bp;
        this._cholestrol = _cholestrol;
        this._hypo = _hypo;
        this._glucose = _glucose;

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_dob() {
        return _dob;
    }

    public void set_dob(String _dob) {
        this._dob = _dob;
    }

    public int get_bp() {
        return _bp;
    }

    public void set_bp(int _bp) {
        this._bp = _bp;
    }
    public int get_cholestrol() {
        return _cholestrol;
    }

    public void set_cholestrol(int _cholestrol) {
        this._cholestrol = _cholestrol;
    }
    public int get_hypo() {
        return _hypo;
    }

    public void set_hypo(int _hypo) {
        this._hypo = _hypo;
    }
    public int get_glucose() {
        return _glucose;
    }

    public void set_glucose(int _glucose) {
        this._glucose = _glucose;
    }
}
