// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AtLimitRecordSampleTest {

    @Test
    fun create() {
        val atLimitRecordSample = AtLimitRecordSample.builder().label("label").objectId(0).build()

        assertThat(atLimitRecordSample.label()).isEqualTo("label")
        assertThat(atLimitRecordSample.objectId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val atLimitRecordSample = AtLimitRecordSample.builder().label("label").objectId(0).build()

        val roundtrippedAtLimitRecordSample =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(atLimitRecordSample),
                jacksonTypeRef<AtLimitRecordSample>(),
            )

        assertThat(roundtrippedAtLimitRecordSample).isEqualTo(atLimitRecordSample)
    }
}
