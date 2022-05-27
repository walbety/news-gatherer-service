package com.walbety.blank.service.sample.model;

import com.walbety.blank.gateway.repository.entity.SampleEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-11T05:50:39-0300",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
public class SampleModelMapperImpl implements SampleModelMapper {

    @Override
    public List<SampleModel> fromEntity(List<SampleEntity> sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        List<SampleModel> list = new ArrayList<SampleModel>( sampleModel.size() );
        for ( SampleEntity sampleEntity : sampleModel ) {
            list.add( sampleEntityToSampleModel( sampleEntity ) );
        }

        return list;
    }

    protected SampleModel sampleEntityToSampleModel(SampleEntity sampleEntity) {
        if ( sampleEntity == null ) {
            return null;
        }

        SampleModel.SampleModelBuilder sampleModel = SampleModel.builder();

        sampleModel.id( sampleEntity.id );
        sampleModel.hashId( sampleEntity.hashId );
        sampleModel.value( sampleEntity.value );

        return sampleModel.build();
    }
}
