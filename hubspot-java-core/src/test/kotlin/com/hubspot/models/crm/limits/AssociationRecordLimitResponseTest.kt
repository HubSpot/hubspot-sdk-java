// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationRecordLimitResponseTest {

    @Test
    fun create() {
        val associationRecordLimitResponse =
            AssociationRecordLimitResponse.builder()
                .addAtLimitFromRecordSample(
                    AtLimitRecordSample.builder().label("label").objectId(0).build()
                )
                .limit(0L)
                .addNearLimitFromRecordSample(
                    NearLimitRecordSample.builder()
                        .label("label")
                        .objectId(0)
                        .percentage(0.0)
                        .usage(0)
                        .build()
                )
                .totalRecordsAtLimit(0)
                .totalRecordsNearLimit(0)
                .build()

        assertThat(associationRecordLimitResponse.atLimitFromRecordSamples())
            .containsExactly(AtLimitRecordSample.builder().label("label").objectId(0).build())
        assertThat(associationRecordLimitResponse.limit()).isEqualTo(0L)
        assertThat(associationRecordLimitResponse.nearLimitFromRecordSamples())
            .containsExactly(
                NearLimitRecordSample.builder()
                    .label("label")
                    .objectId(0)
                    .percentage(0.0)
                    .usage(0)
                    .build()
            )
        assertThat(associationRecordLimitResponse.totalRecordsAtLimit()).isEqualTo(0)
        assertThat(associationRecordLimitResponse.totalRecordsNearLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationRecordLimitResponse =
            AssociationRecordLimitResponse.builder()
                .addAtLimitFromRecordSample(
                    AtLimitRecordSample.builder().label("label").objectId(0).build()
                )
                .limit(0L)
                .addNearLimitFromRecordSample(
                    NearLimitRecordSample.builder()
                        .label("label")
                        .objectId(0)
                        .percentage(0.0)
                        .usage(0)
                        .build()
                )
                .totalRecordsAtLimit(0)
                .totalRecordsNearLimit(0)
                .build()

        val roundtrippedAssociationRecordLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationRecordLimitResponse),
                jacksonTypeRef<AssociationRecordLimitResponse>(),
            )

        assertThat(roundtrippedAssociationRecordLimitResponse)
            .isEqualTo(associationRecordLimitResponse)
    }
}
