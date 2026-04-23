// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AtLimitRecordSampleTest {

    @Test
    fun create() {
        val atLimitRecordSample = AtLimitRecordSample.builder().label("label").objectId(0L).build()

        assertThat(atLimitRecordSample.label()).isEqualTo("label")
        assertThat(atLimitRecordSample.objectId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val atLimitRecordSample = AtLimitRecordSample.builder().label("label").objectId(0L).build()

        val roundtrippedAtLimitRecordSample =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(atLimitRecordSample),
                jacksonTypeRef<AtLimitRecordSample>(),
            )

        assertThat(roundtrippedAtLimitRecordSample).isEqualTo(atLimitRecordSample)
    }
}
