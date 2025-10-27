// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.CollectionResponsePublicActionFunctionIdentifierNoPaging
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionArchiveByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionListParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionReadParams
import java.util.function.Consumer

interface FunctionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService

    /** Retrieve all functions included in a definition. */
    fun list(
        definitionId: String,
        params: FunctionListParams,
    ): CollectionResponsePublicActionFunctionIdentifierNoPaging =
        list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: FunctionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicActionFunctionIdentifierNoPaging =
        list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(params: FunctionListParams): CollectionResponsePublicActionFunctionIdentifierNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FunctionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicActionFunctionIdentifierNoPaging

    /** Archive a function for a definition */
    fun delete(functionId: String, params: FunctionDeleteParams) =
        delete(functionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FunctionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FunctionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Delete a function within a given definition. */
    fun archiveByFunctionType(
        functionType: FunctionArchiveByFunctionTypeParams.FunctionType,
        params: FunctionArchiveByFunctionTypeParams,
    ) = archiveByFunctionType(functionType, params, RequestOptions.none())

    /** @see archiveByFunctionType */
    fun archiveByFunctionType(
        functionType: FunctionArchiveByFunctionTypeParams.FunctionType,
        params: FunctionArchiveByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archiveByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see archiveByFunctionType */
    fun archiveByFunctionType(params: FunctionArchiveByFunctionTypeParams) =
        archiveByFunctionType(params, RequestOptions.none())

    /** @see archiveByFunctionType */
    fun archiveByFunctionType(
        params: FunctionArchiveByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Update a function for a given definition by ID. */
    fun createOrReplace(
        functionId: String,
        params: FunctionCreateOrReplaceParams,
    ): PublicActionFunctionIdentifier = createOrReplace(functionId, params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        functionId: String,
        params: FunctionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier =
        createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see createOrReplace */
    fun createOrReplace(params: FunctionCreateOrReplaceParams): PublicActionFunctionIdentifier =
        createOrReplace(params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        params: FunctionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier

    /** Add a function for a given definition. */
    fun createOrReplaceByFunctionType(
        functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: FunctionCreateOrReplaceByFunctionTypeParams,
    ): PublicActionFunctionIdentifier =
        createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: FunctionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier =
        createOrReplaceByFunctionType(
            params.toBuilder().functionType(functionType).build(),
            requestOptions,
        )

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: FunctionCreateOrReplaceByFunctionTypeParams
    ): PublicActionFunctionIdentifier = createOrReplaceByFunctionType(params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: FunctionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier

    /** Retrieve functions by a type for a given definition */
    fun getByFunctionType(
        functionType: FunctionGetByFunctionTypeParams.FunctionType,
        params: FunctionGetByFunctionTypeParams,
    ): PublicActionFunction = getByFunctionType(functionType, params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        functionType: FunctionGetByFunctionTypeParams.FunctionType,
        params: FunctionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunction =
        getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see getByFunctionType */
    fun getByFunctionType(params: FunctionGetByFunctionTypeParams): PublicActionFunction =
        getByFunctionType(params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        params: FunctionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunction

    /** Retrieve a specific function from a given definition. */
    fun read(functionId: String, params: FunctionReadParams): PublicActionFunction =
        read(functionId, params, RequestOptions.none())

    /** @see read */
    fun read(
        functionId: String,
        params: FunctionReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunction =
        read(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see read */
    fun read(params: FunctionReadParams): PublicActionFunction = read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: FunctionReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunction

    /** A view of [FunctionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/functions`, but is otherwise the same as
         * [FunctionService.list].
         */
        @MustBeClosed
        fun list(
            definitionId: String,
            params: FunctionListParams,
        ): HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
            list(definitionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            definitionId: String,
            params: FunctionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
            list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: FunctionListParams
        ): HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FunctionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}/{functionId}`, but
         * is otherwise the same as [FunctionService.delete].
         */
        @MustBeClosed
        fun delete(functionId: String, params: FunctionDeleteParams): HttpResponse =
            delete(functionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            functionId: String,
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: FunctionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}`, but is otherwise
         * the same as [FunctionService.archiveByFunctionType].
         */
        @MustBeClosed
        fun archiveByFunctionType(
            functionType: FunctionArchiveByFunctionTypeParams.FunctionType,
            params: FunctionArchiveByFunctionTypeParams,
        ): HttpResponse = archiveByFunctionType(functionType, params, RequestOptions.none())

        /** @see archiveByFunctionType */
        @MustBeClosed
        fun archiveByFunctionType(
            functionType: FunctionArchiveByFunctionTypeParams.FunctionType,
            params: FunctionArchiveByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            archiveByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see archiveByFunctionType */
        @MustBeClosed
        fun archiveByFunctionType(params: FunctionArchiveByFunctionTypeParams): HttpResponse =
            archiveByFunctionType(params, RequestOptions.none())

        /** @see archiveByFunctionType */
        @MustBeClosed
        fun archiveByFunctionType(
            params: FunctionArchiveByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}/{functionId}`, but
         * is otherwise the same as [FunctionService.createOrReplace].
         */
        @MustBeClosed
        fun createOrReplace(
            functionId: String,
            params: FunctionCreateOrReplaceParams,
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplace(functionId, params, RequestOptions.none())

        /** @see createOrReplace */
        @MustBeClosed
        fun createOrReplace(
            functionId: String,
            params: FunctionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see createOrReplace */
        @MustBeClosed
        fun createOrReplace(
            params: FunctionCreateOrReplaceParams
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplace(params, RequestOptions.none())

        /** @see createOrReplace */
        @MustBeClosed
        fun createOrReplace(
            params: FunctionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier>

        /**
         * Returns a raw HTTP response for `put
         * /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}`, but is otherwise
         * the same as [FunctionService.createOrReplaceByFunctionType].
         */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: FunctionCreateOrReplaceByFunctionTypeParams,
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: FunctionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplaceByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see createOrReplaceByFunctionType */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            params: FunctionCreateOrReplaceByFunctionTypeParams
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplaceByFunctionType(params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            params: FunctionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier>

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}`, but is otherwise
         * the same as [FunctionService.getByFunctionType].
         */
        @MustBeClosed
        fun getByFunctionType(
            functionType: FunctionGetByFunctionTypeParams.FunctionType,
            params: FunctionGetByFunctionTypeParams,
        ): HttpResponseFor<PublicActionFunction> =
            getByFunctionType(functionType, params, RequestOptions.none())

        /** @see getByFunctionType */
        @MustBeClosed
        fun getByFunctionType(
            functionType: FunctionGetByFunctionTypeParams.FunctionType,
            params: FunctionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunction> =
            getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

        /** @see getByFunctionType */
        @MustBeClosed
        fun getByFunctionType(
            params: FunctionGetByFunctionTypeParams
        ): HttpResponseFor<PublicActionFunction> = getByFunctionType(params, RequestOptions.none())

        /** @see getByFunctionType */
        @MustBeClosed
        fun getByFunctionType(
            params: FunctionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunction>

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}/{functionId}`, but
         * is otherwise the same as [FunctionService.read].
         */
        @MustBeClosed
        fun read(
            functionId: String,
            params: FunctionReadParams,
        ): HttpResponseFor<PublicActionFunction> = read(functionId, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            functionId: String,
            params: FunctionReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunction> =
            read(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(params: FunctionReadParams): HttpResponseFor<PublicActionFunction> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: FunctionReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunction>
    }
}
