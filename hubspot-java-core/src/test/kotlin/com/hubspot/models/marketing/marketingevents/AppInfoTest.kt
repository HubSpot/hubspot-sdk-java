// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppInfoTest {

    @Test
    fun create() {
        val appInfo = AppInfo.builder().id("id").name("name").build()

        assertThat(appInfo.id()).isEqualTo("id")
        assertThat(appInfo.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appInfo = AppInfo.builder().id("id").name("name").build()

        val roundtrippedAppInfo =
            jsonMapper.readValue(jsonMapper.writeValueAsString(appInfo), jacksonTypeRef<AppInfo>())

        assertThat(roundtrippedAppInfo).isEqualTo(appInfo)
    }
}
