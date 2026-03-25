// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AssociationSpec
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/hubspot-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()

        assertThat(client).isNotNull()
        assertThat(client.account()).isNotNull()
        assertThat(client.automation()).isNotNull()
        assertThat(client.cms()).isNotNull()
        assertThat(client.crm()).isNotNull()
        assertThat(client.dataStudio()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.marketing()).isNotNull()
        assertThat(client.meta()).isNotNull()
        assertThat(client.scheduler()).isNotNull()
        assertThat(client.settings()).isNotNull()
    }

    @Test
    fun associationSpecRoundtrip() {
        val jsonMapper = jsonMapper()
        val associationSpec =
            AssociationSpec.builder()
                .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .build()

        val roundtrippedAssociationSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationSpec),
                jacksonTypeRef<AssociationSpec>(),
            )

        assertThat(roundtrippedAssociationSpec).isEqualTo(associationSpec)
    }
}
