package com.walbety.blank.controller.mapper;

import com.walbety.blank.controller.model.SampleResponse;
import com.walbety.blank.service.sample.model.SampleModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-10T06:43:49-0300",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
public class SampleResponseMapperImpl implements SampleResponseMapper {

    @Override
    public List<SampleResponse> toSampleResponse(List<SampleModel> sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        List<SampleResponse> list = new ArrayList<SampleResponse>( sampleModel.size() );
        for ( SampleModel sampleModel1 : sampleModel ) {
            list.add( sampleModelToSampleResponse( sampleModel1 ) );
        }

        return list;
    }

    protected SampleResponse sampleModelToSampleResponse(SampleModel sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        SampleResponse.SampleResponseBuilder sampleResponse = SampleResponse.builder();

        sampleResponse.id( convertId( sampleModel.getId() ) );
        sampleResponse.hashId( sampleModel.getHashId() );
        sampleResponse.value( sampleModel.getValue() );

        return sampleResponse.build();
    }
}
