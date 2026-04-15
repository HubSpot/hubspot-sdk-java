// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrmPropertyWrapperTest {

    @Test
    fun create() {
        val crmPropertyWrapper = CrmPropertyWrapper.builder().name("name").value("value").build()

        assertThat(crmPropertyWrapper.name()).isEqualTo("name")
        assertThat(crmPropertyWrapper.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val crmPropertyWrapper = CrmPropertyWrapper.builder().name("name").value("value").build()

        val roundtrippedCrmPropertyWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(crmPropertyWrapper),
                jacksonTypeRef<CrmPropertyWrapper>(),
            )

        assertThat(roundtrippedCrmPropertyWrapper).isEqualTo(crmPropertyWrapper)
    }
}
