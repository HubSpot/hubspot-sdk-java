// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.cms.hubdb.BoundedNextPage
import com.hubspot_sdk.api.models.cms.hubdb.BoundedPaging
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3Wrapper
import com.hubspot_sdk.api.models.cms.hubdb.RandomAccessCollectionResponseWithTotalHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot_sdk.api.models.crm.objects.contacts.PublicGdprDeleteInput
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
        assertThat(client.auth()).isNotNull()
        assertThat(client.automation()).isNotNull()
        assertThat(client.businessUnits()).isNotNull()
        assertThat(client.cms()).isNotNull()
        assertThat(client.communicationPreferences()).isNotNull()
        assertThat(client.conversations()).isNotNull()
        assertThat(client.crm()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.marketing()).isNotNull()
        assertThat(client.meta()).isNotNull()
        assertThat(client.scheduler()).isNotNull()
        assertThat(client.settings()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun publicGdprDeleteInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicGdprDeleteInput =
            PublicGdprDeleteInput.builder().objectId("objectId").idProperty("idProperty").build()

        val roundtrippedPublicGdprDeleteInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicGdprDeleteInput),
                jacksonTypeRef<PublicGdprDeleteInput>(),
            )

        assertThat(roundtrippedPublicGdprDeleteInput).isEqualTo(publicGdprDeleteInput)
    }

    @Test
    fun unifiedCollectionResponseWithTotalBaseHubDbTableRowV3Roundtrip() {
        val jsonMapper = jsonMapper()
        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                .ofRandomAccessCollectionResponseWithTotal(
                    RandomAccessCollectionResponseWithTotalHubDbTableRowV3.builder()
                        .addResult(HubDbTableRowV3Wrapper.builder().build())
                        .total(0)
                        .type(
                            RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type
                                .RANDOM_ACCESS
                        )
                        .paging(
                            BoundedPaging.builder()
                                .next(BoundedNextPage.builder().offset(0).link("link").build())
                                .build()
                        )
                        .build()
                )

        val roundtrippedUnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                ),
                jacksonTypeRef<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(),
            )

        assertThat(roundtrippedUnifiedCollectionResponseWithTotalBaseHubDbTableRowV3)
            .isEqualTo(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3)
    }
}
