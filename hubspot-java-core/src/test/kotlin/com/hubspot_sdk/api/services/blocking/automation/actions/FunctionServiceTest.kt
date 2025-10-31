// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FunctionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            functionService.list(
                FunctionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        collectionResponsePublicActionFunctionIdentifierNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        functionService.delete(
            FunctionDeleteParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionDeleteParams.FunctionType.PRE_ACTION_EXECUTION)
                .functionId("functionId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOrReplace() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunctionIdentifier =
            functionService.createOrReplace(
                FunctionCreateOrReplaceParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionCreateOrReplaceParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .body("body")
                    .build()
            )

        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOrReplaceByFunctionType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunctionIdentifier =
            functionService.createOrReplaceByFunctionType(
                FunctionCreateOrReplaceByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionCreateOrReplaceByFunctionTypeParams.FunctionType
                            .PRE_ACTION_EXECUTION
                    )
                    .body("body")
                    .build()
            )

        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByFunctionType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        functionService.deleteByFunctionType(
            FunctionDeleteByFunctionTypeParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionDeleteByFunctionTypeParams.FunctionType.PRE_ACTION_EXECUTION)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunction =
            functionService.get(
                FunctionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        publicActionFunction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByFunctionType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunction =
            functionService.getByFunctionType(
                FunctionGetByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetByFunctionTypeParams.FunctionType.PRE_ACTION_EXECUTION)
                    .build()
            )

        publicActionFunction.validate()
    }
}
