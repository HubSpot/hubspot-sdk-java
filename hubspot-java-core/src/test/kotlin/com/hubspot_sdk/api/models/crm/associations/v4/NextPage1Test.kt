// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NextPage1Test {

    @Test
    fun create() {
        val nextPage1 = NextPage1.builder().after("after").link("link").build()

        assertThat(nextPage1.after()).isEqualTo("after")
        assertThat(nextPage1.link()).contains("link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nextPage1 = NextPage1.builder().after("after").link("link").build()

        val roundtrippedNextPage1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nextPage1),
                jacksonTypeRef<NextPage1>(),
            )

        assertThat(roundtrippedNextPage1).isEqualTo(nextPage1)
    }
}
