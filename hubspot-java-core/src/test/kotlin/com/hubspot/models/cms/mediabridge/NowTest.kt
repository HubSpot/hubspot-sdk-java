// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NowTest {

    @Test
    fun create() {
        val now =
            Now.builder().operator(Now.Operator.NOW).propertyName("propertyName").value(0.0).build()

        assertThat(now.operator()).isEqualTo(Now.Operator.NOW)
        assertThat(now.propertyName()).contains("propertyName")
        assertThat(now.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val now =
            Now.builder().operator(Now.Operator.NOW).propertyName("propertyName").value(0.0).build()

        val roundtrippedNow =
            jsonMapper.readValue(jsonMapper.writeValueAsString(now), jacksonTypeRef<Now>())

        assertThat(roundtrippedNow).isEqualTo(now)
    }
}
