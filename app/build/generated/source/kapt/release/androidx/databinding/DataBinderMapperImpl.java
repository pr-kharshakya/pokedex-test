package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.skydoves.pokedex.DataBinderMapperImpl());
  }
}
