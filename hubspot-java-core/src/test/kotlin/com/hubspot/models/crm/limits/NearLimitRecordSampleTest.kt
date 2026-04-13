// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NearLimitRecordSampleTest {

    @Test
    fun create() {
        val nearLimitRecordSample =
            NearLimitRecordSample.builder()
                .label("label")
                .objectId(0)
                .percentage(0.0)
                .usage(0)
                .build()

        assertThat(nearLimitRecordSample.label()).isEqualTo("label")
        assertThat(nearLimitRecordSample.objectId()).isEqualTo(0)
        assertThat(nearLimitRecordSample.percentage()).isEqualTo(0.0)
        assertThat(nearLimitRecordSample.usage()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nearLimitRecordSample =
            NearLimitRecordSample.builder()
                .label("label")
                .objectId(0)
                .percentage(0.0)
                .usage(0)
                .build()

        val roundtrippedNearLimitRecordSample =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nearLimitRecordSample),
                jacksonTypeRef<NearLimitRecordSample>(),
            )

        assertThat(roundtrippedNearLimitRecordSample).isEqualTo(nearLimitRecordSample)
    }
}
