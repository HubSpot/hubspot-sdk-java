// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.tasks.TaskCreateParams
import com.hubspot.sdk.models.crm.objects.tasks.TaskDeleteParams
import com.hubspot.sdk.models.crm.objects.tasks.TaskGetParams
import com.hubspot.sdk.models.crm.objects.tasks.TaskListPageAsync
import com.hubspot.sdk.models.crm.objects.tasks.TaskListParams
import com.hubspot.sdk.models.crm.objects.tasks.TaskSearchParams
import com.hubspot.sdk.models.crm.objects.tasks.TaskUpdateParams
import com.hubspot.sdk.services.async.crm.objects.tasks.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TaskServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a task with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard tasks is provided.
     */
    fun create(params: TaskCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaskCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            TaskCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{taskId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{taskId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(taskId: String, params: TaskUpdateParams): CompletableFuture<SimplePublicObject> =
        update(taskId, params, RequestOptions.none())

    /** @see update */
    fun update(
        taskId: String,
        params: TaskUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see update */
    fun update(params: TaskUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TaskUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of tasks. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<TaskListPageAsync> = list(TaskListParams.none())

    /** @see list */
    fun list(
        params: TaskListParams = TaskListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskListPageAsync>

    /** @see list */
    fun list(params: TaskListParams = TaskListParams.none()): CompletableFuture<TaskListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TaskListPageAsync> =
        list(TaskListParams.none(), requestOptions)

    /** Move an Object identified by `{taskId}` to the recycling bin. */
    fun delete(taskId: String): CompletableFuture<Void?> = delete(taskId, TaskDeleteParams.none())

    /** @see delete */
    fun delete(
        taskId: String,
        params: TaskDeleteParams = TaskDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see delete */
    fun delete(
        taskId: String,
        params: TaskDeleteParams = TaskDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(taskId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TaskDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TaskDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taskId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(taskId, TaskDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{taskId}`. `{taskId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(taskId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(taskId, TaskGetParams.none())

    /** @see get */
    fun get(
        taskId: String,
        params: TaskGetParams = TaskGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see get */
    fun get(
        taskId: String,
        params: TaskGetParams = TaskGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(taskId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaskGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: TaskGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(taskId, TaskGetParams.none(), requestOptions)

    /**
     * Execute a search for tasks based on the provided criteria, including filters, properties, and
     * sorting options. This allows for retrieving tasks that match specific conditions or property
     * values.
     */
    fun search(
        params: TaskSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: TaskSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            TaskSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [TaskServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tasks`, but is otherwise the
         * same as [TaskServiceAsync.create].
         */
        fun create(
            params: TaskCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TaskCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                TaskCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/tasks/{taskId}`, but is
         * otherwise the same as [TaskServiceAsync.update].
         */
        fun update(
            taskId: String,
            params: TaskUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(taskId, params, RequestOptions.none())

        /** @see update */
        fun update(
            taskId: String,
            params: TaskUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TaskUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TaskUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/tasks`, but is otherwise the
         * same as [TaskServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TaskListPageAsync>> =
            list(TaskListParams.none())

        /** @see list */
        fun list(
            params: TaskListParams = TaskListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskListPageAsync>>

        /** @see list */
        fun list(
            params: TaskListParams = TaskListParams.none()
        ): CompletableFuture<HttpResponseFor<TaskListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TaskListPageAsync>> =
            list(TaskListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/tasks/{taskId}`, but is
         * otherwise the same as [TaskServiceAsync.delete].
         */
        fun delete(taskId: String): CompletableFuture<HttpResponse> =
            delete(taskId, TaskDeleteParams.none())

        /** @see delete */
        fun delete(
            taskId: String,
            params: TaskDeleteParams = TaskDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see delete */
        fun delete(
            taskId: String,
            params: TaskDeleteParams = TaskDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(taskId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TaskDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TaskDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(taskId, TaskDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/tasks/{taskId}`, but is
         * otherwise the same as [TaskServiceAsync.get].
         */
        fun get(
            taskId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(taskId, TaskGetParams.none())

        /** @see get */
        fun get(
            taskId: String,
            params: TaskGetParams = TaskGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see get */
        fun get(
            taskId: String,
            params: TaskGetParams = TaskGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(taskId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TaskGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: TaskGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(taskId, TaskGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tasks/search`, but is
         * otherwise the same as [TaskServiceAsync.search].
         */
        fun search(
            params: TaskSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: TaskSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                TaskSearchParams.builder()
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
