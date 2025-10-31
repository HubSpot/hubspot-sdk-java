// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetCreateParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetDeleteParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetGetParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetListPageAsync
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetListParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetSearchParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.goaltargets.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GoalTargetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GoalTargetServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a goal target with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard goal targets is provided.
     */
    fun create(
        params: GoalTargetCreateParams
    ): CompletableFuture<CreatedResponseSimplePublicObject> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GoalTargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            GoalTargetCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{goalTargetId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{goalTargetId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        goalTargetId: String,
        params: GoalTargetUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(goalTargetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        goalTargetId: String,
        params: GoalTargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

    /** @see update */
    fun update(params: GoalTargetUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GoalTargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of goal targets. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<GoalTargetListPageAsync> = list(GoalTargetListParams.none())

    /** @see list */
    fun list(
        params: GoalTargetListParams = GoalTargetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GoalTargetListPageAsync>

    /** @see list */
    fun list(
        params: GoalTargetListParams = GoalTargetListParams.none()
    ): CompletableFuture<GoalTargetListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GoalTargetListPageAsync> =
        list(GoalTargetListParams.none(), requestOptions)

    /** Delete a goal target by `{goalTargetId}` to the recycling bin. */
    fun delete(goalTargetId: String): CompletableFuture<Void?> =
        delete(goalTargetId, GoalTargetDeleteParams.none())

    /** @see delete */
    fun delete(
        goalTargetId: String,
        params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

    /** @see delete */
    fun delete(
        goalTargetId: String,
        params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(goalTargetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GoalTargetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: GoalTargetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(goalTargetId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(goalTargetId, GoalTargetDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{goalTargetId}`. `{goalTargetId}` refers to the internal object
     * ID by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(goalTargetId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(goalTargetId, GoalTargetGetParams.none())

    /** @see get */
    fun get(
        goalTargetId: String,
        params: GoalTargetGetParams = GoalTargetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

    /** @see get */
    fun get(
        goalTargetId: String,
        params: GoalTargetGetParams = GoalTargetGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(goalTargetId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GoalTargetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: GoalTargetGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        goalTargetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(goalTargetId, GoalTargetGetParams.none(), requestOptions)

    /** Search for goal targets using specified criteria. */
    fun search(
        params: GoalTargetSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: GoalTargetSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            GoalTargetSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [GoalTargetServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GoalTargetServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/goal_targets`, but is otherwise the
         * same as [GoalTargetServiceAsync.create].
         */
        fun create(
            params: GoalTargetCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GoalTargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                GoalTargetCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/goal_targets/{goalTargetId}`, but
         * is otherwise the same as [GoalTargetServiceAsync.update].
         */
        fun update(
            goalTargetId: String,
            params: GoalTargetUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(goalTargetId, params, RequestOptions.none())

        /** @see update */
        fun update(
            goalTargetId: String,
            params: GoalTargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

        /** @see update */
        fun update(
            params: GoalTargetUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GoalTargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/goal_targets`, but is otherwise the
         * same as [GoalTargetServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GoalTargetListPageAsync>> =
            list(GoalTargetListParams.none())

        /** @see list */
        fun list(
            params: GoalTargetListParams = GoalTargetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GoalTargetListPageAsync>>

        /** @see list */
        fun list(
            params: GoalTargetListParams = GoalTargetListParams.none()
        ): CompletableFuture<HttpResponseFor<GoalTargetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GoalTargetListPageAsync>> =
            list(GoalTargetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/goal_targets/{goalTargetId}`, but
         * is otherwise the same as [GoalTargetServiceAsync.delete].
         */
        fun delete(goalTargetId: String): CompletableFuture<HttpResponse> =
            delete(goalTargetId, GoalTargetDeleteParams.none())

        /** @see delete */
        fun delete(
            goalTargetId: String,
            params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

        /** @see delete */
        fun delete(
            goalTargetId: String,
            params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(goalTargetId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GoalTargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: GoalTargetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            goalTargetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(goalTargetId, GoalTargetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/goal_targets/{goalTargetId}`, but is
         * otherwise the same as [GoalTargetServiceAsync.get].
         */
        fun get(
            goalTargetId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(goalTargetId, GoalTargetGetParams.none())

        /** @see get */
        fun get(
            goalTargetId: String,
            params: GoalTargetGetParams = GoalTargetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

        /** @see get */
        fun get(
            goalTargetId: String,
            params: GoalTargetGetParams = GoalTargetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(goalTargetId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: GoalTargetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: GoalTargetGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            goalTargetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(goalTargetId, GoalTargetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/goal_targets/search`, but is
         * otherwise the same as [GoalTargetServiceAsync.search].
         */
        fun search(
            params: GoalTargetSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: GoalTargetSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                GoalTargetSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
