/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the truth value of (x != y) element-wise.
 * <p>
 * <i>NOTE</i>: `math.NotEqual` supports broadcasting. More about broadcasting
 * [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 */
@Operator(group = "math")
public final class NotEqual extends PrimitiveOp implements Operand<Boolean> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.math.NotEqual}
   */
  public static class Options {
    
    /**
     * @param incompatibleShapeError 
     */
    public Options incompatibleShapeError(Boolean incompatibleShapeError) {
      this.incompatibleShapeError = incompatibleShapeError;
      return this;
    }
    
    private Boolean incompatibleShapeError;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new NotEqual operation.
   * 
   * @param scope current scope
   * @param x 
   * @param y 
   * @param options carries optional attributes values
   * @return a new instance of NotEqual
   */
  public static <T> NotEqual create(Scope scope, Operand<T> x, Operand<T> y, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("NotEqual", scope.makeOpName("NotEqual"));
    opBuilder.addInput(x.asOutput());
    opBuilder.addInput(y.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.incompatibleShapeError != null) {
          opBuilder.setAttr("incompatible_shape_error", opts.incompatibleShapeError);
        }
      }
    }
    return new NotEqual(opBuilder.build());
  }
  
  /**
   * @param incompatibleShapeError 
   */
  public static Options incompatibleShapeError(Boolean incompatibleShapeError) {
    return new Options().incompatibleShapeError(incompatibleShapeError);
  }
  
  /**
   */
  public Output<Boolean> z() {
    return z;
  }
  
  @Override
  public Output<Boolean> asOutput() {
    return z;
  }
  
  private Output<Boolean> z;
  
  private NotEqual(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}