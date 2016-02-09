/*
 * Copyright 2016 inpwtepydjuf@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mmarquee.automation.uiautomation;

import com4j.*;

@IID("{5ED5202E-B2AC-47A6-B638-4B0BF140D78E}")
public interface IUIAutomationSelectionPattern extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type mmarquee.automation.uiautomation.IUIAutomationElementArray
   */

  @VTID(3)
  mmarquee.automation.uiautomation.IUIAutomationElementArray getCurrentSelection();


  /**
   * <p>
   * Getter method for the COM property "CurrentCanSelectMultiple"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(4)
  int currentCanSelectMultiple();


  /**
   * <p>
   * Getter method for the COM property "CurrentIsSelectionRequired"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(5)
  int currentIsSelectionRequired();


  /**
   * @return  Returns a value of type mmarquee.automation.uiautomation.IUIAutomationElementArray
   */

  @VTID(6)
  mmarquee.automation.uiautomation.IUIAutomationElementArray getCachedSelection();


  /**
   * <p>
   * Getter method for the COM property "CachedCanSelectMultiple"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(7)
  int cachedCanSelectMultiple();


  /**
   * <p>
   * Getter method for the COM property "CachedIsSelectionRequired"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(8)
  int cachedIsSelectionRequired();


  // Properties:
}
