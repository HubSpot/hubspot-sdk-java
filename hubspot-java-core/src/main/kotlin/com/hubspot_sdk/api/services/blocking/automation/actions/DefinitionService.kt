// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionRequiresObjectResponse
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionGetParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionGetRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionListPage
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionUpdateParams
import java.util.function.Consumer

interface DefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService

    /** Create a new custom workflow action. */
    fun create(appId: Int, params: DefinitionCreateParams): PublicActionDefinition =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: DefinitionCreateParams): PublicActionDefinition =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition

    /** Update an existing action definition by ID. */
    fun update(definitionId: String, params: DefinitionUpdateParams): PublicActionDefinition =
        update(definitionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        definitionId: String,
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition =
        update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see update */
    fun update(params: DefinitionUpdateParams): PublicActionDefinition =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition

    /** Retrieve custom workflow action definitions by app ID. */
    fun list(appId: Int): DefinitionListPage = list(appId, DefinitionListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: DefinitionListParams = DefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefinitionListPage = list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: DefinitionListParams = DefinitionListParams.none(),
    ): DefinitionListPage = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefinitionListPage

    /** @see list */
    fun list(params: DefinitionListParams): DefinitionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(appId: Int, requestOptions: RequestOptions): DefinitionListPage =
        list(appId, DefinitionListParams.none(), requestOptions)

    /** Delete an action definition by ID. */
    fun delete(definitionId: String, params: DefinitionDeleteParams) =
        delete(definitionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        definitionId: String,
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DefinitionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Set whether a custom action definition requires an object. */
    fun createRequiresObject(definitionId: String, params: DefinitionCreateRequiresObjectParams) =
        createRequiresObject(definitionId, params, RequestOptions.none())

    /** @see createRequiresObject */
    fun createRequiresObject(
        definitionId: String,
        params: DefinitionCreateRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see createRequiresObject */
    fun createRequiresObject(params: DefinitionCreateRequiresObjectParams) =
        createRequiresObject(params, RequestOptions.none())

    /** @see createRequiresObject */
    fun createRequiresObject(
        params: DefinitionCreateRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Retrieve a custom workflow action definition by ID. */
    fun get(definitionId: String, params: DefinitionGetParams): PublicActionDefinition =
        get(definitionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        definitionId: String,
        params: DefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition =
        get(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see get */
    fun get(params: DefinitionGetParams): PublicActionDefinition =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition

    /** Retrieve whether a custom action definition requires an object. */
    fun getRequiresObject(
        definitionId: String,
        params: DefinitionGetRequiresObjectParams,
    ): PublicActionDefinitionRequiresObjectResponse =
        getRequiresObject(definitionId, params, RequestOptions.none())

    /** @see getRequiresObject */
    fun getRequiresObject(
        definitionId: String,
        params: DefinitionGetRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinitionRequiresObjectResponse =
        getRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see getRequiresObject */
    fun getRequiresObject(
        params: DefinitionGetRequiresObjectParams
    ): PublicActionDefinitionRequiresObjectResponse =
        getRequiresObject(params, RequestOptions.none())

    /** @see getRequiresObject */
    fun getRequiresObject(
        params: DefinitionGetRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinitionRequiresObjectResponse

    /** A view of [DefinitionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/actions/2026-03/{appId}`, but is
         * otherwise the same as [DefinitionService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: DefinitionCreateParams,
        ): HttpResponseFor<PublicActionDefinition> = create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: DefinitionCreateParams): HttpResponseFor<PublicActionDefinition> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition>

        /**
         * Returns a raw HTTP response for `patch
         * /automation/actions/2026-03/{appId}/{definitionId}`, but is otherwise the same as
         * [DefinitionService.update].
         */
        @MustBeClosed
        fun update(
            definitionId: String,
            params: DefinitionUpdateParams,
        ): HttpResponseFor<PublicActionDefinition> =
            update(definitionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            definitionId: String,
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition> =
            update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DefinitionUpdateParams): HttpResponseFor<PublicActionDefinition> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition>

        /**
         * Returns a raw HTTP response for `get /automation/actions/2026-03/{appId}`, but is
         * otherwise the same as [DefinitionService.list].
         */
        @MustBeClosed
        fun list(appId: Int): HttpResponseFor<DefinitionListPage> =
            list(appId, DefinitionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: DefinitionListParams = DefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefinitionListPage> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: DefinitionListParams = DefinitionListParams.none(),
        ): HttpResponseFor<DefinitionListPage> = list(appId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefinitionListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DefinitionListParams): HttpResponseFor<DefinitionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(appId: Int, requestOptions: RequestOptions): HttpResponseFor<DefinitionListPage> =
            list(appId, DefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}`, but is otherwise the same as
         * [DefinitionService.delete].
         */
        @MustBeClosed
        fun delete(definitionId: String, params: DefinitionDeleteParams): HttpResponse =
            delete(definitionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            definitionId: String,
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: DefinitionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/2026-03/{appId}/{definitionId}/requires-object`, but is otherwise the
         * same as [DefinitionService.createRequiresObject].
         */
        @MustBeClosed
        fun createRequiresObject(
            definitionId: String,
            params: DefinitionCreateRequiresObjectParams,
        ): HttpResponse = createRequiresObject(definitionId, params, RequestOptions.none())

        /** @see createRequiresObject */
        @MustBeClosed
        fun createRequiresObject(
            definitionId: String,
            params: DefinitionCreateRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createRequiresObject(
                params.toBuilder().definitionId(definitionId).build(),
                requestOptions,
            )

        /** @see createRequiresObject */
        @MustBeClosed
        fun createRequiresObject(params: DefinitionCreateRequiresObjectParams): HttpResponse =
            createRequiresObject(params, RequestOptions.none())

        /** @see createRequiresObject */
        @MustBeClosed
        fun createRequiresObject(
            params: DefinitionCreateRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /automation/actions/2026-03/{appId}/{definitionId}`,
         * but is otherwise the same as [DefinitionService.get].
         */
        @MustBeClosed
        fun get(
            definitionId: String,
            params: DefinitionGetParams,
        ): HttpResponseFor<PublicActionDefinition> =
            get(definitionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            definitionId: String,
            params: DefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition> =
            get(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: DefinitionGetParams): HttpResponseFor<PublicActionDefinition> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/requires-object`, but is otherwise the
         * same as [DefinitionService.getRequiresObject].
         */
        @MustBeClosed
        fun getRequiresObject(
            definitionId: String,
            params: DefinitionGetRequiresObjectParams,
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse> =
            getRequiresObject(definitionId, params, RequestOptions.none())

        /** @see getRequiresObject */
        @MustBeClosed
        fun getRequiresObject(
            definitionId: String,
            params: DefinitionGetRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse> =
            getRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see getRequiresObject */
        @MustBeClosed
        fun getRequiresObject(
            params: DefinitionGetRequiresObjectParams
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse> =
            getRequiresObject(params, RequestOptions.none())

        /** @see getRequiresObject */
        @MustBeClosed
        fun getRequiresObject(
            params: DefinitionGetRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>
    }
}
