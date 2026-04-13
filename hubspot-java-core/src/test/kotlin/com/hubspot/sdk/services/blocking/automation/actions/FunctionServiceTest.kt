// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.automation.actions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionDeleteByFunctionTypeParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionGetParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FunctionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            functionService.list(
                FunctionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        collectionResponsePublicActionFunctionIdentifierNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        functionService.delete(
            FunctionDeleteParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionDeleteParams.FunctionType.POST_ACTION_EXECUTION)
                .functionId("functionId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrReplace() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        val publicActionFunctionIdentifier =
            functionService.createOrReplace(
                FunctionCreateOrReplaceParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionCreateOrReplaceParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .body("body")
                    .build()
            )

        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrReplaceByFunctionType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        val publicActionFunctionIdentifier =
            functionService.createOrReplaceByFunctionType(
                FunctionCreateOrReplaceByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionCreateOrReplaceByFunctionTypeParams.FunctionType
                            .POST_ACTION_EXECUTION
                    )
                    .body("body")
                    .build()
            )

        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByFunctionType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        functionService.deleteByFunctionType(
            FunctionDeleteByFunctionTypeParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionDeleteByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        val publicActionFunction =
            functionService.get(
                FunctionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        publicActionFunction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByFunctionType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val functionService = client.automation().actions().functions()

        val publicActionFunction =
            functionService.getByFunctionType(
                FunctionGetByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionGetByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                    )
                    .build()
            )

        publicActionFunction.validate()
    }
}
